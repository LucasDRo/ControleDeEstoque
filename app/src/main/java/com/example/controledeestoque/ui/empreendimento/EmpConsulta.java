package com.example.controledeestoque.ui.empreendimento;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.controledeestoque.R;
import com.example.controledeestoque.control.DataBaseHelper;
import com.example.controledeestoque.control.DataBaseHelperEmpreendimento;
import com.example.controledeestoque.model.Empreendimento;

public class EmpConsulta extends Fragment {

    private DataBaseHelperEmpreendimento dbHelper;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_emp_consulta, container, false);


        Button btnConsultar = rootView.findViewById(R.id.btnConsultarEmp);

        btnConsultar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String nome = getActivity().findViewById(R.id.nomeEmp).toString();
                if(!nome.equals("")){
                    dbHelper = new DataBaseHelperEmpreendimento(getActivity().getApplicationContext());
                    Empreendimento empreendimento = dbHelper.consultar(nome);

                    if(empreendimento!=null){
                        preencher(empreendimento);
                    }else{
                        limpar();
                        Toast.makeText(getActivity(), "Empreendimento não encontrado!", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    limpar();
                    Toast.makeText(getActivity(), "Preencha o campo com o Nome Fantasia da empresa!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return rootView;
    }

    private void limpar(){
        EditText edtNomeFantasia = getView().findViewById(R.id.edtNomeFantasia);
        EditText edtRua = getView().findViewById(R.id.edtRua);
        EditText edtRazaoSocial = getView().findViewById(R.id.edtRazaoSocial);
        EditText edtCnpj = getView().findViewById(R.id.edtCnpj);
        EditText edtInscEstadual = getView().findViewById(R.id.edtInscricaoEstadual);
        EditText edtBairro = getView().findViewById(R.id.edtBairro);
        EditText edtNum = getView().findViewById(R.id.edtNum);
        EditText edtCidade = getView().findViewById(R.id.edtCidade);
        EditText edtEstado = getView().findViewById(R.id.edtEstado);

        edtNomeFantasia.setText("");
        edtRua.setText("");
        edtRazaoSocial.setText("");
        edtCnpj.setText("");
        edtInscEstadual.setText("");
        edtBairro.setText("");
        edtNum.setText("");
        edtCidade.setText("");
        edtEstado.setText("");
    }

    public void preencher(Empreendimento emp){
        EditText edtNomeFantasia = getView().findViewById(R.id.edtNomeFantasia);
        EditText edtRua = getView().findViewById(R.id.edtRua);
        EditText edtRazaoSocial = getView().findViewById(R.id.edtRazaoSocial);
        EditText edtCnpj = getView().findViewById(R.id.edtCnpj);
        EditText edtInscEstadual = getView().findViewById(R.id.edtInscricaoEstadual);
        EditText edtBairro = getView().findViewById(R.id.edtBairro);
        EditText edtNum = getView().findViewById(R.id.edtNum);
        EditText edtCidade = getView().findViewById(R.id.edtCidade);
        EditText edtEstado = getView().findViewById(R.id.edtEstado);

        edtNomeFantasia.setText(emp.getNomeFantasia());
        edtRua.setText(emp.getRua());
        edtRazaoSocial.setText(emp.getRazaoSocial());
        edtCnpj.setText(String.valueOf(emp.getCnpj()));
        edtInscEstadual.setText(String.valueOf(emp.getinscEstadual()));
        edtBairro.setText(emp.getRua());
        edtNum.setText(String.valueOf(emp.getNum()));
        edtCidade.setText(emp.getCidade());
        edtEstado.setText(emp.getEstado());
    }
}