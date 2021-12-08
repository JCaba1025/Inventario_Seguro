package com.misiontic.inventarioseguro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreateUser extends AppCompatActivity {

    private EditText nick, name, email, passW, CpassW;

    AwesomeValidation awesomeValidation;

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);

        /*nick = findViewById(R.id.Tx_Nick);
        name = findViewById(R.id.Tx_Name);
        email = findViewById(R.id.Tx_Email);
        passW = findViewById(R.id.Tx_PassW);
        CpassW = findViewById(R.id.Tx_CPassW);*/

    }

    public void SingUp(View view){

    }

    /*public void SingUp(View view){

        firebaseAuth = FirebaseAuth.getInstance();

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        awesomeValidation.addValidation(this, R.id.Tx_Email, Patterns.EMAIL_ADDRESS, R.string.Invalid_email);
        awesomeValidation.addValidation(this,R.id.Tx_PassW, ".{6,0}", R.string.Invalid_passW);

        String nick_S = nick.getText().toString();
        String name_S = name.getText().toString();
        String email_S = email.getText().toString();
        String passW_S = passW.getText().toString();
        String CpassW_S = CpassW.getText().toString();

        if(passW_S.equals(CpassW_S)){

            if (awesomeValidation.validate()){

                firebaseAuth.createUserWithEmailAndPassword(email_S, passW_S).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(CreateUser.this, "Usuario creado con exito", Toast.LENGTH_SHORT).show();
                            CreateUserDB(nick_S, name_S, email_S, passW_S);
                            finish();
                        }else{
                            String errorUser = ((FirebaseAuthException) task.getException()).getErrorCode();
                            Toast.makeText(CreateUser.this, "No se pudo completar regitro por: " + errorUser, Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }

        }else {
            Toast.makeText(this, "Las contraseñas son diferentes", Toast.LENGTH_SHORT).show();
        }

    }

    public void CreateUserDB(String nickDB, String nameDB,String emailDB, String passWDB){

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("UsersInventarioSeguro");

        myRef.child("User_" + emailDB).child("nick").setValue(nickDB);
        myRef.child("User_" + emailDB).child("name").setValue(nameDB);
        myRef.child("User_" + emailDB).child("email").setValue(emailDB);
        myRef.child("User_" + emailDB).child("passW").setValue(passWDB);

    }*/

}