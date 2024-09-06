package com.example.controledeestoque.ui.empreendimento;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.controledeestoque.R;
import com.example.controledeestoque.control.DataBaseHelper;
import com.example.controledeestoque.control.DataBaseHelperEmpreendimento;
import com.example.controledeestoque.model.Empreendimento;

public class empreendimentoFrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_empreendimento, container, false);

        Button btnCadastrar = rootView.findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadastarEmp();
            }
        });

        return rootView;
    }


    public void cadastarEmp() {
        EditText edtNomeFantasia = getView().findViewById(R.id.edtNomeFantasia);
        EditText edtRua = getView().findViewById(R.id.edtRua);
        EditText edtRazaoSocial = getView().findViewById(R.id.edtRazaoSocial);
        EditText edtCnpj = getView().findViewById(R.id.edtCnpj);
        EditText edtInscEstadual = getView().findViewById(R.id.edtInscricaoEstadual);
        EditText edtBairro = getView().findViewById(R.id.edtBairro);
        EditText edtNum = getView().findViewById(R.id.edtNum);
        EditText edtCidade = getView().findViewById(R.id.edtCidade);
        EditText edtEstado = getView().findViewById(R.id.edtEstado);

        Empreendimento emp = new Empreendimento();

        emp.setNomeFantasia(edtNomeFantasia.getText().toString());
        emp.setRua(edtRua.getText().toString());
        emp.setRazaoSocial(edtRazaoSocial.getText().toString());
        emp.setCnpj(Double.parseDouble(String.valueOf(edtCnpj.getText())));
        emp.setInscEstadual(Double.parseDouble(String.valueOf(edtInscEstadual.getText())));
        emp.setBairro(edtBairro.getText().toString());
        emp.setNum(Integer.parseInt(String.valueOf(edtNum.getText())));
        emp.setCidade(edtCidade.getText().toString());
        emp.setEstado(edtEstado.getText().toString());

        DataBaseHelperEmpreendimento dbHelper = new DataBaseHelperEmpreendimento(getActivity().getApplicationContext());

        long resul = dbHelper.cadastrar(emp);
        if(resul != -1){
            Toast.makeText(getActivity(), "Empreendimento cadastrado!", Toast.LENGTH_SHORT).show();
            edtCidade.setText("");
            edtEstado.setText("");
            edtCnpj.setText("");
            edtBairro.setText("");
            edtNum.setText("");
            edtRua.setText("");
            edtInscEstadual.setText("");
            edtNomeFantasia.setText("");
            edtRazaoSocial.setText("");
        }else
            Toast.makeText(getActivity(), "Erro ao cadastrar empreendimento!", Toast.LENGTH_SHORT).show();


    }
}