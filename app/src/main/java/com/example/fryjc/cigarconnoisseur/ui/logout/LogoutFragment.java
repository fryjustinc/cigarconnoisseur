package com.example.fryjc.cigarconnoisseur.ui.logout;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

import com.example.fryjc.cigarconnoisseur.ui.login.Login;
import com.example.fryjc.cigarconnoisseur.ui.main.MainActivity;

/**
 * Created by fryjc on 6/16/2015.
 */
public class LogoutFragment extends android.support.v4.app.DialogFragment {


    public final static String EXTRA_MESSAGE = "com.example.fryjc.cigarconnoisseur.MESSAGE";


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Are you sure you wish to logout?")
                .setPositiveButton("Logout", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(getActivity(), Login.class);
                        String message = "LOGOUT";
                        intent.putExtra(EXTRA_MESSAGE, message);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ((MainActivity) getActivity()).resetLogOut();
                        LogoutFragment.this.getDialog().cancel();
                    }
                });
        return builder.create();
    }
}
