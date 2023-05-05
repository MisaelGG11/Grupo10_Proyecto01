package com.example.grupo10_proyecto01;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> Auditorio = new ArrayList<String>();
        Auditorio.add("Auditorio Miguel Marmol");

        List<String> Biblioteca = new ArrayList<String>();
        Biblioteca.add("BIB301");
        Biblioteca.add("BIB302");
        Biblioteca.add("Salon El Espino");

        List<String> EdiB = new ArrayList<String>();
        EdiB.add("B11");
        EdiB.add("B12");
        EdiB.add("B13");
        EdiB.add("B14");
        EdiB.add("B21");
        EdiB.add("B22");
        EdiB.add("B23");
        EdiB.add("B24");
        EdiB.add("B31");
        EdiB.add("B32");
        EdiB.add("B33");
        EdiB.add("B34");
        EdiB.add("B41");
        EdiB.add("B42");
        EdiB.add("B43");
        EdiB.add("B44");

        List<String> EdiC = new ArrayList<String>();
        EdiC.add("C11");
        EdiC.add("C12");
        EdiC.add("C13");
        EdiC.add("C14");
        EdiC.add("C21");
        EdiC.add("C22");
        EdiC.add("C23");
        EdiC.add("C24");
        EdiC.add("C31");
        EdiC.add("C32");
        EdiC.add("C33");
        EdiC.add("C34");
        EdiC.add("C41");
        EdiC.add("C42");
        EdiC.add("C43");
        EdiC.add("C44");

        List<String> EdiD = new ArrayList<String>();
        EdiD.add("D11");
        EdiD.add("D12");
        EdiD.add("D13");
        EdiD.add("D14");
        EdiD.add("D21");
        EdiD.add("D22");
        EdiD.add("D23");
        EdiD.add("D24");
        EdiD.add("D31");
        EdiD.add("D32");
        EdiD.add("D33");
        EdiD.add("D34");
        EdiD.add("D41");
        EdiD.add("D42");
        EdiD.add("D43");
        EdiD.add("D44");

        List<String> labUCB = new ArrayList<String>();
        labUCB.add("F1");
        labUCB.add("F2");

        expandableListDetail.put("Auditorio Miguel Mármol", Auditorio);
        expandableListDetail.put("Biblioteca FIA", Biblioteca);
        expandableListDetail.put("Edificio B", EdiB);
        expandableListDetail.put("Edificio C", EdiC);
        expandableListDetail.put("Edificio D", EdiD);
        expandableListDetail.put("Laboratorios Ciencias Básicas", labUCB);
        return expandableListDetail;
    }
}
