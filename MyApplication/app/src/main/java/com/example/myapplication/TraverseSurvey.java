package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TraverseSurvey extends AppCompatActivity {
//载入一站所有的数据

    private EditText riQiValue;
    private EditText shiJianValue;
    private EditText yiQiXingHaoValue;
    private EditText yiQiGaoValue;
    private EditText ceZhanMingValue;
    private EditText guanCeZheValue;
    private EditText jiLuZheValue;
    private EditText tianQiValue;
    private EditText ceHuiShu1;
    private EditText ceHuiShu1ZhaoZhunDian1;
    private EditText CH1ZZD1PZdu;
    private EditText CH1ZZD1PZfen;
    private EditText CH1ZZD1PZmiao;
    private EditText CH1ZZD1PYdu;
    private EditText CH1ZZD1PYfen;
    private EditText CH1ZZD1PYmiao;
    private EditText ceHuiShu1ZhaoZhunDian2;
    private EditText CH1ZZD2PZdu;
    private EditText CH1ZZD2PZfen;
    private EditText CH1ZZD2PZmiao;
    private EditText CH1ZZD2PYdu;
    private EditText CH1ZZD2PYfen;
    private EditText CH1ZZD2PYmiao;
    private EditText ceHuiShu2;
    private EditText ceHuiShu2ZhaoZhunDian1;
    private EditText CH2ZZD1PZdu;
    private EditText CH2ZZD1PZfen;
    private EditText CH2ZZD1PZmiao;
    private EditText CH2ZZD1PYdu;
    private EditText CH2ZZD1PYfen;
    private EditText CH2ZZD1PYmiao;
    private EditText ceHuiShu2ZhaoZhunDian2;
    private EditText CH2ZZD2PZdu;
    private EditText CH2ZZD2PZfen;
    private EditText CH2ZZD2PZmiao;
    private EditText CH2ZZD2PYdu;
    private EditText CH2ZZD2PYfen;
    private EditText CH2ZZD2PYmiao;
    private EditText ceHuiShu3;
    private EditText ceHuiShu3ZhaoZhunDian1;
    private EditText CH3ZZD1PZdu;
    private EditText CH3ZZD1PZfen;
    private EditText CH3ZZD1PZmiao;
    private EditText CH3ZZD1PYdu;
    private EditText CH3ZZD1PYfen;
    private EditText CH3ZZD1PYmiao;
    private EditText ceHuiShu3ZhaoZhunDian2;
    private EditText CH3ZZD2PZdu;
    private EditText CH3ZZD2PZfen;
    private EditText CH3ZZD2PZmiao;
    private EditText CH3ZZD2PYdu;
    private EditText CH3ZZD2PYfen;
    private EditText CH3ZZD2PYmiao;
    private TextView CH1ZZD1du;
    private TextView CH1ZZD1fen;
    private TextView CH1ZZD1miao;
    private TextView CH1ZZD2du;
    private TextView CH1ZZD2fen;
    private TextView CH1ZZD2miao;
    private TextView CH2ZZD1du;
    private TextView CH2ZZD1fen;
    private TextView CH2ZZD1miao;
    private TextView CH2ZZD2du;
    private TextView CH2ZZD2fen;
    private TextView CH2ZZD2miao;
    private TextView CH3ZZD1du;
    private TextView CH3ZZD1fen;
    private TextView CH3ZZD1miao;
    private TextView CH3ZZD2du;
    private TextView CH3ZZD2fen;
    private TextView CH3ZZD2miao;
    private TextView CH1YCHdu;
    private TextView CH1YCHfen;
    private TextView CH1YCHmiao;
    private TextView CH2YCHdu;
    private TextView CH2YCHfen;
    private TextView CH2YCHmiao;
    private TextView CH3YCHdu;
    private TextView CH3YCHfen;
    private TextView CH3YCHmiao;
    private TextView CHPJdu;
    private TextView CHPJfen;
    private TextView CHPJmiao;
    private EditText chuiZhiJiaoChanDian1;
    private EditText chuiZhiJiaoChanDian1CeHui1;
    private EditText chuiZhiJiaoChanDian1CeHui1PZDu;
    private EditText chuiZhiJiaoChanDian1CeHui1PZFen;
    private EditText chuiZhiJiaoChanDian1CeHui1PZMiao;
    private EditText chuiZhiJiaoChanDian1CeHui1PYDu;
    private EditText chuiZhiJiaoChanDian1CeHui1PYFen;
    private EditText chuiZhiJiaoChanDian1CeHui1PYMiao;
    private EditText chuiZhiJiaoChanDian1CeHui2;
    private EditText chuiZhiJiaoChanDian1CeHui2PZDu;
    private EditText chuiZhiJiaoChanDian1CeHui2PZFen;
    private EditText chuiZhiJiaoChanDian1CeHui2PZMiao;
    private EditText chuiZhiJiaoChanDian1CeHui2PYDu;
    private EditText chuiZhiJiaoChanDian1CeHui2PYFen;
    private EditText chuiZhiJiaoChanDian1CeHui2PYMiao;
    private EditText chuiZhiJiaoChanDian2;
    private EditText chuiZhiJiaoChanDian2CeHui1;
    private EditText chuiZhiJiaoChanDian2CeHui1PZDu;
    private EditText chuiZhiJiaoChanDian2CeHui1PZFen;
    private EditText chuiZhiJiaoChanDian2CeHui1PZMiao;
    private EditText chuiZhiJiaoChanDian2CeHui1PYDu;
    private EditText chuiZhiJiaoChanDian2CeHui1PYFen;
    private EditText chuiZhiJiaoChanDian2CeHui1PYMiao;
    private EditText chuiZhiJiaoChanDian2CeHui2;
    private EditText chuiZhiJiaoChanDian2CeHui2PZDu;
    private EditText chuiZhiJiaoChanDian2CeHui2PZFen;
    private EditText chuiZhiJiaoChanDian2CeHui2PZMiao;
    private EditText chuiZhiJiaoChanDian2CeHui2PYDu;
    private EditText chuiZhiJiaoChanDian2CeHui2PYFen;
    private EditText chuiZhiJiaoChanDian2CeHui2PYMiao;
    private TextView chuiZhiJiaoChanDian1CeHui1ZBCDu;
    private TextView chuiZhiJiaoChanDian1CeHui1ZBCFen;
    private TextView chuiZhiJiaoChanDian1CeHui1ZBCMiao;
    private TextView chuiZhiJiaoChanDian1CeHui2ZBCDu;
    private TextView chuiZhiJiaoChanDian1CeHui2ZBCFen;
    private TextView chuiZhiJiaoChanDian1CeHui2ZBCMiao;
    private TextView chuiZhiJiaoChanDian2CeHui1ZBCDu;
    private TextView chuiZhiJiaoChanDian2CeHui1ZBCFen;
    private TextView chuiZhiJiaoChanDian2CeHui1ZBCMiao;
    private TextView chuiZhiJiaoChanDian2CeHui2ZBCDu;
    private TextView chuiZhiJiaoChanDian2CeHui2ZBCFen;
    private TextView chuiZhiJiaoChanDian2CeHui2ZBCMiao;
    private TextView chuiZhiJiaoChanDian1CeHui1CZJDu;
    private TextView chuiZhiJiaoChanDian1CeHui1CZJFen;
    private TextView chuiZhiJiaoChanDian1CeHui1CZJMiao;
    private TextView chuiZhiJiaoChanDian1CeHui2CZJDu;
    private TextView chuiZhiJiaoChanDian1CeHui2CZJFen;
    private TextView chuiZhiJiaoChanDian1CeHui2CZJMiao;
    private TextView chuiZhiJiaoChanDian2CeHui1CZJDu;
    private TextView chuiZhiJiaoChanDian2CeHui1CZJFen;
    private TextView chuiZhiJiaoChanDian2CeHui1CZJMiao;
    private TextView chuiZhiJiaoChanDian2CeHui2CZJDu;
    private TextView chuiZhiJiaoChanDian2CeHui2CZJFen;
    private TextView chuiZhiJiaoChanDian2CeHui2CZJMiao;
    private EditText chuiZhiJiaoChanDian1JingGao;
    private EditText chuiZhiJiaoChanDian2JingGao;
    private EditText bianChang1;
    private EditText bianChang1DuShu1;
    private EditText bianChang1DuShu2;
    private EditText bianChang1DuShu3;
    private EditText bianChang1DuShu4;
    private EditText bianChang1WenDu;
    private EditText bianChang1QiYa;
    private EditText bianChang2;
    private EditText bianChang2DuShu1;
    private EditText bianChang2DuShu2;
    private EditText bianChang2DuShu3;
    private EditText bianChang2DuShu4;
    private EditText bianChang2WenDu;
    private EditText bianChang2QiYa;
    private TextView bianChang1PJZ;
    private TextView bianChang2PJZ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traverse_survey);
        /*a = (EditText)findViewById(R.id.a);*/
        riQiValue=(EditText)findViewById(R.id.riQiValue);
        shiJianValue=(EditText)findViewById(R.id.shiJianValue);
        yiQiXingHaoValue=(EditText)findViewById(R.id.yiQiXingHaoValue);
        yiQiGaoValue=(EditText)findViewById(R.id.yiQiGaoValue);
        ceZhanMingValue=(EditText)findViewById(R.id.ceZhanMingValue);
        guanCeZheValue=(EditText)findViewById(R.id.guanCeZheValue);
        jiLuZheValue=(EditText)findViewById(R.id.jiLuZheValue);
        tianQiValue=(EditText)findViewById(R.id.tianQiValue);
        ceHuiShu1=(EditText)findViewById(R.id.ceHuiShu1);
        ceHuiShu1ZhaoZhunDian1=(EditText)findViewById(R.id.ceHuiShu1ZhaoZhunDian1);
        CH1ZZD1PZdu=(EditText)findViewById(R.id.CH1ZZD1PZdu);
        CH1ZZD1PZfen=(EditText)findViewById(R.id.CH1ZZD1PZfen);
        CH1ZZD1PZmiao=(EditText)findViewById(R.id.CH1ZZD1PZmiao);
        CH1ZZD1PYdu=(EditText)findViewById(R.id.CH1ZZD1PYdu);
        CH1ZZD1PYfen=(EditText)findViewById(R.id.CH1ZZD1PYfen);
        CH1ZZD1PYmiao=(EditText)findViewById(R.id.CH1ZZD1PYmiao);
        ceHuiShu1ZhaoZhunDian2=(EditText)findViewById(R.id.ceHuiShu1ZhaoZhunDian2);
        CH1ZZD2PZdu=(EditText)findViewById(R.id.CH1ZZD2PZdu);
        CH1ZZD2PZfen=(EditText)findViewById(R.id.CH1ZZD2PZfen);
        CH1ZZD2PZmiao=(EditText)findViewById(R.id.CH1ZZD2PZmiao);
        CH1ZZD2PYdu=(EditText)findViewById(R.id.CH1ZZD2PYdu);
        CH1ZZD2PYfen=(EditText)findViewById(R.id.CH1ZZD2PYfen);
        CH1ZZD2PYmiao=(EditText)findViewById(R.id.CH1ZZD2PYmiao);
        ceHuiShu2=(EditText)findViewById(R.id.ceHuiShu2);
        ceHuiShu2ZhaoZhunDian1=(EditText)findViewById(R.id.ceHuiShu2ZhaoZhunDian1);
        CH2ZZD1PZdu=(EditText)findViewById(R.id.CH2ZZD1PZdu);
        CH2ZZD1PZfen=(EditText)findViewById(R.id.CH2ZZD1PZfen);
        CH2ZZD1PZmiao=(EditText)findViewById(R.id.CH2ZZD1PZmiao);
        CH2ZZD1PYdu=(EditText)findViewById(R.id.CH2ZZD1PYdu);
        CH2ZZD1PYfen=(EditText)findViewById(R.id.CH2ZZD1PYfen);
        CH2ZZD1PYmiao=(EditText)findViewById(R.id.CH2ZZD1PYmiao);
        ceHuiShu2ZhaoZhunDian2=(EditText)findViewById(R.id.ceHuiShu2ZhaoZhunDian2);
        CH2ZZD2PZdu=(EditText)findViewById(R.id.CH2ZZD2PZdu);
        CH2ZZD2PZfen=(EditText)findViewById(R.id.CH2ZZD2PZfen);
        CH2ZZD2PZmiao=(EditText)findViewById(R.id.CH2ZZD2PZmiao);
        CH2ZZD2PYdu=(EditText)findViewById(R.id.CH2ZZD2PYdu);
        CH2ZZD2PYfen=(EditText)findViewById(R.id.CH2ZZD2PYfen);
        CH2ZZD2PYmiao=(EditText)findViewById(R.id.CH2ZZD2PYmiao);
        ceHuiShu3=(EditText)findViewById(R.id.ceHuiShu3);
        ceHuiShu3ZhaoZhunDian1=(EditText)findViewById(R.id.ceHuiShu3ZhaoZhunDian1);
        CH3ZZD1PZdu=(EditText)findViewById(R.id.CH3ZZD1PZdu);
        CH3ZZD1PZfen=(EditText)findViewById(R.id.CH3ZZD1PZfen);
        CH3ZZD1PZmiao=(EditText)findViewById(R.id.CH3ZZD1PZmiao);
        CH3ZZD1PYdu=(EditText)findViewById(R.id.CH3ZZD1PYdu);
        CH3ZZD1PYfen=(EditText)findViewById(R.id.CH3ZZD1PYfen);
        CH3ZZD1PYmiao=(EditText)findViewById(R.id.CH3ZZD1PYmiao);
        ceHuiShu3ZhaoZhunDian2=(EditText)findViewById(R.id.ceHuiShu3ZhaoZhunDian2);
        CH3ZZD2PZdu=(EditText)findViewById(R.id.CH3ZZD2PZdu);
        CH3ZZD2PZfen=(EditText)findViewById(R.id.CH3ZZD2PZfen);
        CH3ZZD2PZmiao=(EditText)findViewById(R.id.CH3ZZD2PZmiao);
        CH3ZZD2PYdu=(EditText)findViewById(R.id.CH3ZZD2PYdu);
        CH3ZZD2PYfen=(EditText)findViewById(R.id.CH3ZZD2PYfen);
        CH3ZZD2PYmiao=(EditText)findViewById(R.id.CH3ZZD2PYmiao);
        CH1ZZD1du=(TextView)findViewById(R.id.CH1ZZD1du);
        CH1ZZD1fen=(TextView)findViewById(R.id.CH1ZZD1fen);
        CH1ZZD1miao=(TextView)findViewById(R.id.CH1ZZD1miao);
        CH1ZZD2du=(TextView)findViewById(R.id.CH1ZZD2du);
        CH1ZZD2fen=(TextView)findViewById(R.id.CH1ZZD2fen);
        CH1ZZD2miao=(TextView)findViewById(R.id.CH1ZZD2miao);
        CH2ZZD1du=(TextView)findViewById(R.id.CH2ZZD1du);
        CH2ZZD1fen=(TextView)findViewById(R.id.CH2ZZD1fen);
        CH2ZZD1miao=(TextView)findViewById(R.id.CH2ZZD1miao);
        CH2ZZD2du=(TextView)findViewById(R.id.CH2ZZD2du);
        CH2ZZD2fen=(TextView)findViewById(R.id.CH2ZZD2fen);
        CH2ZZD2miao=(TextView)findViewById(R.id.CH2ZZD2miao);
        CH3ZZD1du=(TextView)findViewById(R.id.CH3ZZD1du);
        CH3ZZD1fen=(TextView)findViewById(R.id.CH3ZZD1fen);
        CH3ZZD1miao=(TextView)findViewById(R.id.CH3ZZD1miao);
        CH3ZZD2du=(TextView)findViewById(R.id.CH3ZZD2du);
        CH3ZZD2fen=(TextView)findViewById(R.id.CH3ZZD2fen);
        CH3ZZD2miao=(TextView)findViewById(R.id.CH3ZZD2miao);
        CH1YCHdu=(TextView)findViewById(R.id.CH1YCHdu);
        CH1YCHfen=(TextView)findViewById(R.id.CH1YCHfen);
        CH1YCHmiao=(TextView)findViewById(R.id.CH1YCHmiao);
        CH2YCHdu=(TextView)findViewById(R.id.CH2YCHdu);
        CH2YCHfen=(TextView)findViewById(R.id.CH2YCHfen);
        CH2YCHmiao=(TextView)findViewById(R.id.CH2YCHmiao);
        CH3YCHdu=(TextView)findViewById(R.id.CH3YCHdu);
        CH3YCHfen=(TextView)findViewById(R.id.CH3YCHfen);
        CH3YCHmiao=(TextView)findViewById(R.id.CH3YCHmiao);
        CHPJdu=(TextView)findViewById(R.id.CHPJdu);
        CHPJfen=(TextView)findViewById(R.id.CHPJfen);
        CHPJmiao=(TextView)findViewById(R.id.CHPJmiao);
        chuiZhiJiaoChanDian1=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1);
        chuiZhiJiaoChanDian1CeHui1=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1CeHui1);
        chuiZhiJiaoChanDian1CeHui1PZDu=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1CeHui1PZDu);
        chuiZhiJiaoChanDian1CeHui1PZFen=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1CeHui1PZFen);
        chuiZhiJiaoChanDian1CeHui1PZMiao=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1CeHui1PZMiao);
        chuiZhiJiaoChanDian1CeHui1PYDu=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1CeHui1PYDu);
        chuiZhiJiaoChanDian1CeHui1PYFen=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1CeHui1PYFen);
        chuiZhiJiaoChanDian1CeHui1PYMiao=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1CeHui1PYMiao);
        chuiZhiJiaoChanDian1CeHui2=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1CeHui2);
        chuiZhiJiaoChanDian1CeHui2PZDu=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1CeHui2PZDu);
        chuiZhiJiaoChanDian1CeHui2PZFen=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1CeHui2PZFen);
        chuiZhiJiaoChanDian1CeHui2PZMiao=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1CeHui2PZMiao);
        chuiZhiJiaoChanDian1CeHui2PYDu=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1CeHui2PYDu);
        chuiZhiJiaoChanDian1CeHui2PYFen=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1CeHui2PYFen);
        chuiZhiJiaoChanDian1CeHui2PYMiao=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1CeHui2PYMiao);
        chuiZhiJiaoChanDian2=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2);
        chuiZhiJiaoChanDian2CeHui1=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2CeHui1);
        chuiZhiJiaoChanDian2CeHui1PZDu=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2CeHui1PZDu);
        chuiZhiJiaoChanDian2CeHui1PZFen=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2CeHui1PZFen);
        chuiZhiJiaoChanDian2CeHui1PZMiao=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2CeHui1PZMiao);
        chuiZhiJiaoChanDian2CeHui1PYDu=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2CeHui1PYDu);
        chuiZhiJiaoChanDian2CeHui1PYFen=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2CeHui1PYFen);
        chuiZhiJiaoChanDian2CeHui1PYMiao=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2CeHui1PYMiao);
        chuiZhiJiaoChanDian2CeHui2=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2CeHui2);
        chuiZhiJiaoChanDian2CeHui2PZDu=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2CeHui2PZDu);
        chuiZhiJiaoChanDian2CeHui2PZFen=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2CeHui2PZFen);
        chuiZhiJiaoChanDian2CeHui2PZMiao=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2CeHui2PZMiao);
        chuiZhiJiaoChanDian2CeHui2PYDu=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2CeHui2PYDu);
        chuiZhiJiaoChanDian2CeHui2PYFen=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2CeHui2PYFen);
        chuiZhiJiaoChanDian2CeHui2PYMiao=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2CeHui2PYMiao);
        chuiZhiJiaoChanDian1CeHui1ZBCDu=(TextView)findViewById(R.id.chuiZhiJiaoChanDian1CeHui1ZBCDu);
        chuiZhiJiaoChanDian1CeHui1ZBCFen=(TextView)findViewById(R.id.chuiZhiJiaoChanDian1CeHui1ZBCFen);
        chuiZhiJiaoChanDian1CeHui1ZBCMiao=(TextView)findViewById(R.id.chuiZhiJiaoChanDian1CeHui1ZBCMiao);
        chuiZhiJiaoChanDian1CeHui2ZBCDu=(TextView)findViewById(R.id.chuiZhiJiaoChanDian1CeHui2ZBCDu);
        chuiZhiJiaoChanDian1CeHui2ZBCFen=(TextView)findViewById(R.id.chuiZhiJiaoChanDian1CeHui2ZBCFen);
        chuiZhiJiaoChanDian1CeHui2ZBCMiao=(TextView)findViewById(R.id.chuiZhiJiaoChanDian1CeHui2ZBCMiao);
        chuiZhiJiaoChanDian2CeHui1ZBCDu=(TextView)findViewById(R.id.chuiZhiJiaoChanDian2CeHui1ZBCDu);
        chuiZhiJiaoChanDian2CeHui1ZBCFen=(TextView)findViewById(R.id.chuiZhiJiaoChanDian2CeHui1ZBCFen);
        chuiZhiJiaoChanDian2CeHui1ZBCMiao=(TextView)findViewById(R.id.chuiZhiJiaoChanDian2CeHui1ZBCMiao);
        chuiZhiJiaoChanDian2CeHui2ZBCDu=(TextView)findViewById(R.id.chuiZhiJiaoChanDian2CeHui2ZBCDu);
        chuiZhiJiaoChanDian2CeHui2ZBCFen=(TextView)findViewById(R.id.chuiZhiJiaoChanDian2CeHui2ZBCFen);
        chuiZhiJiaoChanDian2CeHui2ZBCMiao=(TextView)findViewById(R.id.chuiZhiJiaoChanDian2CeHui2ZBCMiao);
        chuiZhiJiaoChanDian1CeHui1CZJDu=(TextView)findViewById(R.id.chuiZhiJiaoChanDian1CeHui1CZJDu);
        chuiZhiJiaoChanDian1CeHui1CZJFen=(TextView)findViewById(R.id.chuiZhiJiaoChanDian1CeHui1CZJFen);
        chuiZhiJiaoChanDian1CeHui1CZJMiao=(TextView)findViewById(R.id.chuiZhiJiaoChanDian1CeHui1CZJMiao);
        chuiZhiJiaoChanDian1CeHui2CZJDu=(TextView)findViewById(R.id.chuiZhiJiaoChanDian1CeHui2CZJDu);
        chuiZhiJiaoChanDian1CeHui2CZJFen=(TextView)findViewById(R.id.chuiZhiJiaoChanDian1CeHui2CZJFen);
        chuiZhiJiaoChanDian1CeHui2CZJMiao=(TextView)findViewById(R.id.chuiZhiJiaoChanDian1CeHui2CZJMiao);
        chuiZhiJiaoChanDian2CeHui1CZJDu=(TextView)findViewById(R.id.chuiZhiJiaoChanDian2CeHui1CZJDu);
        chuiZhiJiaoChanDian2CeHui1CZJFen=(TextView)findViewById(R.id.chuiZhiJiaoChanDian2CeHui1CZJFen);
        chuiZhiJiaoChanDian2CeHui1CZJMiao=(TextView)findViewById(R.id.chuiZhiJiaoChanDian2CeHui1CZJMiao);
        chuiZhiJiaoChanDian2CeHui2CZJDu=(TextView)findViewById(R.id.chuiZhiJiaoChanDian2CeHui2CZJDu);
        chuiZhiJiaoChanDian2CeHui2CZJFen=(TextView)findViewById(R.id.chuiZhiJiaoChanDian2CeHui2CZJFen);
        chuiZhiJiaoChanDian2CeHui2CZJMiao=(TextView)findViewById(R.id.chuiZhiJiaoChanDian2CeHui2CZJMiao);
        chuiZhiJiaoChanDian1JingGao=(EditText)findViewById(R.id.chuiZhiJiaoChanDian1JingGao);
        chuiZhiJiaoChanDian2JingGao=(EditText)findViewById(R.id.chuiZhiJiaoChanDian2JingGao);
        bianChang1=(EditText)findViewById(R.id.bianChang1);
        bianChang1DuShu1=(EditText)findViewById(R.id.bianChang1DuShu1);
        bianChang1DuShu2=(EditText)findViewById(R.id.bianChang1DuShu2);
        bianChang1DuShu3=(EditText)findViewById(R.id.bianChang1DuShu3);
        bianChang1DuShu4=(EditText)findViewById(R.id.bianChang1DuShu4);
        bianChang1WenDu=(EditText)findViewById(R.id.bianChang1WenDu);
        bianChang1QiYa=(EditText)findViewById(R.id.bianChang1QiYa);
        bianChang2=(EditText)findViewById(R.id.bianChang2);
        bianChang2DuShu1=(EditText)findViewById(R.id.bianChang2DuShu1);
        bianChang2DuShu2=(EditText)findViewById(R.id.bianChang2DuShu2);
        bianChang2DuShu3=(EditText)findViewById(R.id.bianChang2DuShu3);
        bianChang2DuShu4=(EditText)findViewById(R.id.bianChang2DuShu4);
        bianChang2WenDu=(EditText)findViewById(R.id.bianChang2WenDu);
        bianChang2QiYa=(EditText)findViewById(R.id.bianChang2QiYa);
        bianChang1PJZ=(TextView) findViewById(R.id.bianChang1PJZ);
        bianChang2PJZ=(TextView) findViewById(R.id.bianChang2PJZ);
        //Button but1 = (Button) findViewById(R.id.d);
        Button JiSuan=(Button)findViewById(R.id.JiSuan);
        Button JieShuCeLiang=(Button)findViewById(R.id.JieShuCeLiang);
        //设置点击计算时的事件
        JiSuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                String CH1ZZD1PZduStr=CH1ZZD1PZdu.getText().toString();
                float CH1ZZD1PZduF=Float.parseFloat(CH1ZZD1PZduStr);
                String CH1ZZD1PZfenStr=CH1ZZD1PZfen.getText().toString();
                float CH1ZZD1PZfenF=Float.parseFloat(CH1ZZD1PZfenStr);
                String CH1ZZD1PZmiaoStr=CH1ZZD1PZmiao.getText().toString();
                float CH1ZZD1PZmiaoF=Float.parseFloat(CH1ZZD1PZmiaoStr);

                String CH1ZZD1PYduStr=CH1ZZD1PYdu.getText().toString();
                float CH1ZZD1PYduF=Float.parseFloat(CH1ZZD1PYduStr);
                String CH1ZZD1PYfenStr=CH1ZZD1PYfen.getText().toString();
                float CH1ZZD1PYfenF=Float.parseFloat(CH1ZZD1PYfenStr);
                String CH1ZZD1PYmiaoStr=CH1ZZD1PYmiao.getText().toString();
                float CH1ZZD1PYmiaoF=Float.parseFloat(CH1ZZD1PYmiaoStr);

                String CH1ZZD2PZduStr=CH1ZZD2PZdu.getText().toString();
                float CH1ZZD2PZduF=Float.parseFloat(CH1ZZD2PZduStr);
                String CH1ZZD2PZfenStr=CH1ZZD2PZfen.getText().toString();
                float CH1ZZD2PZfenF=Float.parseFloat(CH1ZZD2PZfenStr);
                String CH1ZZD2PZmiaoStr=CH1ZZD2PZmiao.getText().toString();
                float CH1ZZD2PZmiaoF=Float.parseFloat(CH1ZZD2PZmiaoStr);

                String CH1ZZD2PYduStr=CH1ZZD2PYdu.getText().toString();
                float CH1ZZD2PYduF=Float.parseFloat(CH1ZZD2PYduStr);
                String CH1ZZD2PYfenStr=CH1ZZD2PYfen.getText().toString();
                float CH1ZZD2PYfenF=Float.parseFloat(CH1ZZD2PYfenStr);
                String CH1ZZD2PYmiaoStr=CH1ZZD2PYmiao.getText().toString();
                float CH1ZZD2PYmiaoF=Float.parseFloat(CH1ZZD2PYmiaoStr);

                float CH1ZZD1PZJiaoDu=CH1ZZD1PZduF+CH1ZZD1PZfenF/60+CH1ZZD1PZmiaoF/3600;
                float CH1ZZD2PZJiaoDu=CH1ZZD2PZduF+CH1ZZD2PZfenF/60+CH1ZZD2PZmiaoF/3600;
                float CH1ZZD1PYJiaoDu=CH1ZZD1PYduF+CH1ZZD1PYfenF/60+CH1ZZD1PYmiaoF/3600;
                float CH1ZZD2PYJiaoDu=CH1ZZD2PYduF+CH1ZZD2PYfenF/60+CH1ZZD2PYmiaoF/3600;

                float CH1ZZD1JiaoDu=CH1ZZD2PZJiaoDu-CH1ZZD1PZJiaoDu;
                int CH1ZZD1duI=(int)CH1ZZD1JiaoDu;
                String CH1ZZD1duStr=String.valueOf(CH1ZZD1duI);
                CH1ZZD1du.setText(CH1ZZD1duStr);
                int CH1ZZD1fenI=(int)( CH1ZZD1JiaoDu-CH1ZZD1duI)*60;
                String CH1ZZD1fenStr=String.valueOf(CH1ZZD1fenI);
                CH1ZZD1fen.setText(CH1ZZD1fenStr);
                int CH1ZZD1miaoI=(int)(( CH1ZZD1JiaoDu-CH1ZZD1duI)*60-CH1ZZD1fenI)*60;
                String CH1ZZD1miaoStr=String.valueOf(CH1ZZD1miaoI);
                CH1ZZD1miao.setText(CH1ZZD1miaoStr);

                float CH1ZZD2JiaoDu=CH1ZZD2PYJiaoDu-CH1ZZD1PYJiaoDu;
                int CH1ZZD2duI=(int)CH1ZZD2JiaoDu;
                String CH1ZZD2duStr=String.valueOf(CH1ZZD2duI);
                CH1ZZD2du.setText(CH1ZZD2duStr);
                int CH1ZZD2fenI=(int)( CH1ZZD2JiaoDu-CH1ZZD2duI)*60;
                String CH1ZZD2fenStr=String.valueOf(CH1ZZD2fenI);
                CH1ZZD2fen.setText(CH1ZZD2fenStr);
                int CH1ZZD2miaoI=(int)(( CH1ZZD2JiaoDu-CH1ZZD2duI)*60-CH1ZZD2fenI)*60;
                String CH1ZZD2miaoStr=String.valueOf(CH1ZZD2miaoI);
                CH1ZZD2miao.setText(CH1ZZD2miaoStr);



                ////

                String CH2ZZD1PZduStr=CH2ZZD1PZdu.getText().toString();
                float CH2ZZD1PZduF=Float.parseFloat(CH2ZZD1PZduStr);
                String CH2ZZD1PZfenStr=CH2ZZD1PZfen.getText().toString();
                float CH2ZZD1PZfenF=Float.parseFloat(CH2ZZD1PZfenStr);
                String CH2ZZD1PZmiaoStr=CH2ZZD1PZmiao.getText().toString();
                float CH2ZZD1PZmiaoF=Float.parseFloat(CH2ZZD1PZmiaoStr);

                String CH2ZZD1PYduStr=CH2ZZD1PYdu.getText().toString();
                float CH2ZZD1PYduF=Float.parseFloat(CH2ZZD1PYduStr);
                String CH2ZZD1PYfenStr=CH2ZZD1PYfen.getText().toString();
                float CH2ZZD1PYfenF=Float.parseFloat(CH2ZZD1PYfenStr);
                String CH2ZZD1PYmiaoStr=CH2ZZD1PYmiao.getText().toString();
                float CH2ZZD1PYmiaoF=Float.parseFloat(CH2ZZD1PYmiaoStr);

                String CH2ZZD2PZduStr=CH2ZZD2PZdu.getText().toString();
                float CH2ZZD2PZduF=Float.parseFloat(CH2ZZD2PZduStr);
                String CH2ZZD2PZfenStr=CH2ZZD2PZfen.getText().toString();
                float CH2ZZD2PZfenF=Float.parseFloat(CH2ZZD2PZfenStr);
                String CH2ZZD2PZmiaoStr=CH2ZZD2PZmiao.getText().toString();
                float CH2ZZD2PZmiaoF=Float.parseFloat(CH2ZZD2PZmiaoStr);

                String CH2ZZD2PYduStr=CH2ZZD2PYdu.getText().toString();
                float CH2ZZD2PYduF=Float.parseFloat(CH2ZZD2PYduStr);
                String CH2ZZD2PYfenStr=CH2ZZD2PYfen.getText().toString();
                float CH2ZZD2PYfenF=Float.parseFloat(CH2ZZD2PYfenStr);
                String CH2ZZD2PYmiaoStr=CH2ZZD2PYmiao.getText().toString();
                float CH2ZZD2PYmiaoF=Float.parseFloat(CH2ZZD2PYmiaoStr);

                float CH2ZZD1PZJiaoDu=CH2ZZD1PZduF+CH2ZZD1PZfenF/60+CH2ZZD1PZmiaoF/3600;
                float CH2ZZD2PZJiaoDu=CH2ZZD2PZduF+CH2ZZD2PZfenF/60+CH2ZZD2PZmiaoF/3600;
                float CH2ZZD1PYJiaoDu=CH2ZZD1PYduF+CH2ZZD1PYfenF/60+CH2ZZD1PYmiaoF/3600;
                float CH2ZZD2PYJiaoDu=CH2ZZD2PYduF+CH2ZZD2PYfenF/60+CH2ZZD2PYmiaoF/3600;

                float CH2ZZD1JiaoDu=CH2ZZD2PZJiaoDu-CH2ZZD1PZJiaoDu;
                int CH2ZZD1duI=(int)CH2ZZD1JiaoDu;
                String CH2ZZD1duStr=String.valueOf(CH2ZZD1duI);
                CH2ZZD1du.setText(CH2ZZD1duStr);
                int CH2ZZD1fenI=(int)( CH2ZZD1JiaoDu-CH2ZZD1duI)*60;
                String CH2ZZD1fenStr=String.valueOf(CH2ZZD1fenI);
                CH2ZZD1fen.setText(CH2ZZD1fenStr);
                int CH2ZZD1miaoI=(int)(( CH2ZZD1JiaoDu-CH2ZZD1duI)*60-CH2ZZD1fenI)*60;
                String CH2ZZD1miaoStr=String.valueOf(CH2ZZD1miaoI);
                CH2ZZD1miao.setText(CH2ZZD1miaoStr);

                float CH2ZZD2JiaoDu=CH2ZZD2PYJiaoDu-CH2ZZD1PYJiaoDu;
                int CH2ZZD2duI=(int)CH2ZZD2JiaoDu;
                String CH2ZZD2duStr=String.valueOf(CH2ZZD2duI);
                CH2ZZD2du.setText(CH2ZZD2duStr);
                int CH2ZZD2fenI=(int)( CH2ZZD2JiaoDu-CH2ZZD2duI)*60;
                String CH2ZZD2fenStr=String.valueOf(CH2ZZD2fenI);
                CH2ZZD2fen.setText(CH2ZZD2fenStr);
                int CH2ZZD2miaoI=(int)(( CH2ZZD2JiaoDu-CH2ZZD2duI)*60-CH2ZZD2fenI)*60;
                String CH2ZZD2miaoStr=String.valueOf(CH2ZZD2miaoI);
                CH2ZZD2miao.setText(CH2ZZD2miaoStr);



                /////
                String CH3ZZD1PZduStr=CH3ZZD1PZdu.getText().toString();
                float CH3ZZD1PZduF=Float.parseFloat(CH3ZZD1PZduStr);
                String CH3ZZD1PZfenStr=CH3ZZD1PZfen.getText().toString();
                float CH3ZZD1PZfenF=Float.parseFloat(CH3ZZD1PZfenStr);
                String CH3ZZD1PZmiaoStr=CH3ZZD1PZmiao.getText().toString();
                float CH3ZZD1PZmiaoF=Float.parseFloat(CH3ZZD1PZmiaoStr);

                String CH3ZZD1PYduStr=CH3ZZD1PYdu.getText().toString();
                float CH3ZZD1PYduF=Float.parseFloat(CH3ZZD1PYduStr);
                String CH3ZZD1PYfenStr=CH3ZZD1PYfen.getText().toString();
                float CH3ZZD1PYfenF=Float.parseFloat(CH3ZZD1PYfenStr);
                String CH3ZZD1PYmiaoStr=CH3ZZD1PYmiao.getText().toString();
                float CH3ZZD1PYmiaoF=Float.parseFloat(CH3ZZD1PYmiaoStr);

                String CH3ZZD2PZduStr=CH3ZZD2PZdu.getText().toString();
                float CH3ZZD2PZduF=Float.parseFloat(CH3ZZD2PZduStr);
                String CH3ZZD2PZfenStr=CH3ZZD2PZfen.getText().toString();
                float CH3ZZD2PZfenF=Float.parseFloat(CH3ZZD2PZfenStr);
                String CH3ZZD2PZmiaoStr=CH3ZZD2PZmiao.getText().toString();
                float CH3ZZD2PZmiaoF=Float.parseFloat(CH3ZZD2PZmiaoStr);

                String CH3ZZD2PYduStr=CH3ZZD2PYdu.getText().toString();
                float CH3ZZD2PYduF=Float.parseFloat(CH3ZZD2PYduStr);
                String CH3ZZD2PYfenStr=CH3ZZD2PYfen.getText().toString();
                float CH3ZZD2PYfenF=Float.parseFloat(CH3ZZD2PYfenStr);
                String CH3ZZD2PYmiaoStr=CH3ZZD2PYmiao.getText().toString();
                float CH3ZZD2PYmiaoF=Float.parseFloat(CH3ZZD2PYmiaoStr);

                float CH3ZZD1PZJiaoDu=CH3ZZD1PZduF+CH3ZZD1PZfenF/60+CH3ZZD1PZmiaoF/3600;
                float CH3ZZD2PZJiaoDu=CH3ZZD2PZduF+CH3ZZD2PZfenF/60+CH3ZZD2PZmiaoF/3600;
                float CH3ZZD1PYJiaoDu=CH3ZZD1PYduF+CH3ZZD1PYfenF/60+CH3ZZD1PYmiaoF/3600;
                float CH3ZZD2PYJiaoDu=CH3ZZD2PYduF+CH3ZZD2PYfenF/60+CH3ZZD2PYmiaoF/3600;

                float CH3ZZD1JiaoDu=CH3ZZD2PZJiaoDu-CH3ZZD1PZJiaoDu;
                int CH3ZZD1duI=(int)CH3ZZD1JiaoDu;
                String CH3ZZD1duStr=String.valueOf(CH3ZZD1duI);
                CH3ZZD1du.setText(CH3ZZD1duStr);
                int CH3ZZD1fenI=(int)( CH3ZZD1JiaoDu-CH3ZZD1duI)*60;
                String CH3ZZD1fenStr=String.valueOf(CH3ZZD1fenI);
                CH3ZZD1fen.setText(CH3ZZD1fenStr);
                int CH3ZZD1miaoI=(int)(( CH3ZZD1JiaoDu-CH3ZZD1duI)*60-CH3ZZD1fenI)*60;
                String CH3ZZD1miaoStr=String.valueOf(CH3ZZD1miaoI);
                CH3ZZD1miao.setText(CH3ZZD1miaoStr);

                float CH3ZZD2JiaoDu=CH3ZZD2PYJiaoDu-CH3ZZD1PYJiaoDu;
                int CH3ZZD2duI=(int)CH3ZZD2JiaoDu;
                String CH3ZZD2duStr=String.valueOf(CH3ZZD2duI);
                CH3ZZD2du.setText(CH3ZZD2duStr);
                int CH3ZZD2fenI=(int)( CH3ZZD2JiaoDu-CH3ZZD2duI)*60;
                String CH3ZZD2fenStr=String.valueOf(CH3ZZD2fenI);
                CH3ZZD2fen.setText(CH3ZZD2fenStr);
                int CH3ZZD2miaoI=(int)(( CH3ZZD2JiaoDu-CH3ZZD2duI)*60-CH3ZZD2fenI)*60;
                String CH3ZZD2miaoStr=String.valueOf(CH3ZZD2miaoI);
                CH3ZZD2miao.setText(CH3ZZD2miaoStr);

                ////
                float  CH1YCHJiaoDu=(CH1ZZD1JiaoDu+CH1ZZD2JiaoDu)/2;
                int CH1YCHduI=(int)CH1YCHJiaoDu;
                String CH1YCHduStr=String.valueOf(CH1YCHduI);
                CH1YCHdu.setText(CH1YCHduStr);
                int CH1YCHfenI=(int)(CH1YCHJiaoDu-CH1YCHduI)*60;
                String CH1YCHfenStr=String.valueOf(CH1YCHfenI);
                CH1YCHfen.setText(CH1YCHfenStr);
                int CH1YCHmiaoI=(int)((CH1YCHJiaoDu-CH1YCHduI)*60-CH1YCHfenI)*60;
                String CH1YCHmiaoStr=String.valueOf(CH1YCHmiaoI);
                CH1YCHmiao.setText(CH1YCHmiaoStr);
                ////
                float  CH2YCHJiaoDu=(CH2ZZD1JiaoDu+CH2ZZD2JiaoDu)/2;
                int CH2YCHduI=(int)CH2YCHJiaoDu;
                String CH2YCHduStr=String.valueOf(CH2YCHduI);
                CH2YCHdu.setText(CH2YCHduStr);
                int CH2YCHfenI=(int)(CH2YCHJiaoDu-CH2YCHduI)*60;
                String CH2YCHfenStr=String.valueOf(CH2YCHfenI);
                CH2YCHfen.setText(CH2YCHfenStr);
                int CH2YCHmiaoI=(int)((CH2YCHJiaoDu-CH2YCHduI)*60-CH2YCHfenI)*60;
                String CH2YCHmiaoStr=String.valueOf(CH2YCHmiaoI);
                CH2YCHmiao.setText(CH2YCHmiaoStr);
                /////
                float  CH3YCHJiaoDu=(CH3ZZD1JiaoDu+CH3ZZD2JiaoDu)/2;
                int CH3YCHduI=(int)CH3YCHJiaoDu;
                String CH3YCHduStr=String.valueOf(CH3YCHduI);
                CH3YCHdu.setText(CH3YCHduStr);
                int CH3YCHfenI=(int)(CH3YCHJiaoDu-CH3YCHduI)*60;
                String CH3YCHfenStr=String.valueOf(CH3YCHfenI);
                CH3YCHfen.setText(CH3YCHfenStr);
                int CH3YCHmiaoI=(int)((CH3YCHJiaoDu-CH3YCHduI)*60-CH3YCHfenI)*60;
                String CH3YCHmiaoStr=String.valueOf(CH3YCHmiaoI);
                CH3YCHmiao.setText(CH3YCHmiaoStr);
                ////
                float CHPJJiaoDu=(CH1YCHJiaoDu+CH2YCHJiaoDu)/2;
                int CHPJduI=(int)CHPJJiaoDu;
                String CHPJduStr=String.valueOf(CHPJduI);
                CHPJdu.setText(CHPJduStr);
                int CHPJfenI=(int)(CHPJJiaoDu-CHPJduI)*60;
                String CHPJfenStr=String.valueOf(CHPJfenI);
                CHPJfen.setText(CHPJfenStr);
                int CHPJmiaoI=(int)((CHPJJiaoDu-CHPJduI)*60-CHPJfenI)*60;
                String CHPJmiaoStr=String.valueOf(CHPJmiaoI);
                CHPJmiao.setText(CHPJmiaoStr);

                ////
                String chuiZhiJiaoChanDian1CeHui1PZDuStr=chuiZhiJiaoChanDian1CeHui1PZDu.getText().toString();
                float chuiZhiJiaoChanDian1CeHui1PZDuF=Float.parseFloat(chuiZhiJiaoChanDian1CeHui1PZDuStr);
                String chuiZhiJiaoChanDian1CeHui1PZFenStr=chuiZhiJiaoChanDian1CeHui1PZFen.getText().toString();
                float chuiZhiJiaoChanDian1CeHui1PZFenF=Float.parseFloat(chuiZhiJiaoChanDian1CeHui1PZFenStr);
                String chuiZhiJiaoChanDian1CeHui1PZMiaoStr=chuiZhiJiaoChanDian1CeHui1PZMiao.getText().toString();
                float chuiZhiJiaoChanDian1CeHui1PZMiaoF=Float.parseFloat(chuiZhiJiaoChanDian1CeHui1PZMiaoStr);

                String chuiZhiJiaoChanDian1CeHui2PZDuStr=chuiZhiJiaoChanDian1CeHui2PZDu.getText().toString();
                float chuiZhiJiaoChanDian1CeHui2PZDuF=Float.parseFloat(chuiZhiJiaoChanDian1CeHui2PZDuStr);
                String chuiZhiJiaoChanDian1CeHui2PZFenStr=chuiZhiJiaoChanDian1CeHui2PZFen.getText().toString();
                float chuiZhiJiaoChanDian1CeHui2PZFenF=Float.parseFloat(chuiZhiJiaoChanDian1CeHui2PZFenStr);
                String chuiZhiJiaoChanDian1CeHui2PZMiaoStr=chuiZhiJiaoChanDian1CeHui2PZMiao.getText().toString();
                float chuiZhiJiaoChanDian1CeHui2PZMiaoF=Float.parseFloat(chuiZhiJiaoChanDian1CeHui2PZMiaoStr);

                String chuiZhiJiaoChanDian1CeHui1PYDuStr=chuiZhiJiaoChanDian1CeHui1PYDu.getText().toString();
                float chuiZhiJiaoChanDian1CeHui1PYDuF=Float.parseFloat(chuiZhiJiaoChanDian1CeHui1PYDuStr);
                String chuiZhiJiaoChanDian1CeHui1PYFenStr=chuiZhiJiaoChanDian1CeHui1PYFen.getText().toString();
                float chuiZhiJiaoChanDian1CeHui1PYFenF=Float.parseFloat(chuiZhiJiaoChanDian1CeHui1PYFenStr);
                String chuiZhiJiaoChanDian1CeHui1PYMiaoStr=chuiZhiJiaoChanDian1CeHui1PYMiao.getText().toString();
                float chuiZhiJiaoChanDian1CeHui1PYMiaoF=Float.parseFloat(chuiZhiJiaoChanDian1CeHui1PYMiaoStr);

                String chuiZhiJiaoChanDian1CeHui2PYDuStr=chuiZhiJiaoChanDian1CeHui2PYDu.getText().toString();
                float chuiZhiJiaoChanDian1CeHui2PYDuF=Float.parseFloat(chuiZhiJiaoChanDian1CeHui2PYDuStr);
                String chuiZhiJiaoChanDian1CeHui2PYFenStr=chuiZhiJiaoChanDian1CeHui2PYFen.getText().toString();
                float chuiZhiJiaoChanDian1CeHui2PYFenF=Float.parseFloat(chuiZhiJiaoChanDian1CeHui2PYFenStr);
                String chuiZhiJiaoChanDian1CeHui2PYMiaoStr=chuiZhiJiaoChanDian1CeHui2PYMiao.getText().toString();
                float chuiZhiJiaoChanDian1CeHui2PYMiaoF=Float.parseFloat(chuiZhiJiaoChanDian1CeHui2PYMiaoStr);

                float chuiZhiJiaoChanDian1CeHui1PZJiaoDu=chuiZhiJiaoChanDian1CeHui1PZDuF+chuiZhiJiaoChanDian1CeHui1PZFenF/60+chuiZhiJiaoChanDian1CeHui1PZMiaoF/3600;
                float chuiZhiJiaoChanDian1CeHui2PZJiaoDu=chuiZhiJiaoChanDian1CeHui2PZDuF+chuiZhiJiaoChanDian1CeHui2PZFenF/60+chuiZhiJiaoChanDian1CeHui2PZMiaoF/3600;
                float chuiZhiJiaoChanDian1CeHui1PYJiaoDu=chuiZhiJiaoChanDian1CeHui1PYDuF+chuiZhiJiaoChanDian1CeHui1PYFenF/60+chuiZhiJiaoChanDian1CeHui1PYMiaoF/3600;
                float chuiZhiJiaoChanDian1CeHui2PYJiaoDu=chuiZhiJiaoChanDian1CeHui2PYDuF+chuiZhiJiaoChanDian1CeHui2PYFenF/60+chuiZhiJiaoChanDian1CeHui2PYMiaoF/3600;

                float chuiZhiJiaoChanDian1CeHui1ZBCJiaoDu=(chuiZhiJiaoChanDian1CeHui1PZJiaoDu+chuiZhiJiaoChanDian1CeHui1PYJiaoDu-360)/2;
                int chuiZhiJiaoChanDian1CeHui1ZBCDuI=(int)chuiZhiJiaoChanDian1CeHui1ZBCJiaoDu;
                String chuiZhiJiaoChanDian1CeHui1ZBCDuStr=String.valueOf(chuiZhiJiaoChanDian1CeHui1ZBCDuI);
                chuiZhiJiaoChanDian1CeHui1ZBCDu.setText(chuiZhiJiaoChanDian1CeHui1ZBCDuStr);
                int chuiZhiJiaoChanDian1CeHui1ZBCFenI=(int)(chuiZhiJiaoChanDian1CeHui1ZBCJiaoDu-chuiZhiJiaoChanDian1CeHui1ZBCDuI)*60;
                String chuiZhiJiaoChanDian1CeHui1ZBCFenStr=String.valueOf(chuiZhiJiaoChanDian1CeHui1ZBCFenI);
                chuiZhiJiaoChanDian1CeHui1ZBCFen.setText(chuiZhiJiaoChanDian1CeHui1ZBCFenStr);
                int chuiZhiJiaoChanDian1CeHui1ZBCMiaoI=(int)((chuiZhiJiaoChanDian1CeHui1ZBCJiaoDu-chuiZhiJiaoChanDian1CeHui1ZBCDuI)*60-chuiZhiJiaoChanDian1CeHui1ZBCFenI)*60;
                String chuiZhiJiaoChanDian1CeHui1ZBCMiaoStr=String.valueOf(chuiZhiJiaoChanDian1CeHui1ZBCMiaoI);
                chuiZhiJiaoChanDian1CeHui1ZBCMiao.setText(chuiZhiJiaoChanDian1CeHui1ZBCMiaoStr);

                float chuiZhiJiaoChanDian1CeHui1CZJJiaoDu=(chuiZhiJiaoChanDian1CeHui1PYJiaoDu-chuiZhiJiaoChanDian1CeHui1PZJiaoDu-180)/2;
                int chuiZhiJiaoChanDian1CeHui1CZJDuI=(int)chuiZhiJiaoChanDian1CeHui1CZJJiaoDu;
                String chuiZhiJiaoChanDian1CeHui1CZJDuStr=String.valueOf(chuiZhiJiaoChanDian1CeHui1CZJDuI);
                chuiZhiJiaoChanDian1CeHui1CZJDu.setText(chuiZhiJiaoChanDian1CeHui1CZJDuStr);
                int chuiZhiJiaoChanDian1CeHui1CZJFenI=(int)(chuiZhiJiaoChanDian1CeHui1CZJJiaoDu-chuiZhiJiaoChanDian1CeHui1CZJDuI)*60;
                String chuiZhiJiaoChanDian1CeHui1CZJFenStr=String.valueOf(chuiZhiJiaoChanDian1CeHui1CZJFenI);
                chuiZhiJiaoChanDian1CeHui1CZJFen.setText(chuiZhiJiaoChanDian1CeHui1CZJFenStr);
                int chuiZhiJiaoChanDian1CeHui1CZJMiaoI=(int)((chuiZhiJiaoChanDian1CeHui1CZJJiaoDu-chuiZhiJiaoChanDian1CeHui1CZJDuI)*60-chuiZhiJiaoChanDian1CeHui1CZJFenI);
                String chuiZhiJiaoChanDian1CeHui1CZJMiaoStr=String.valueOf(chuiZhiJiaoChanDian1CeHui1CZJMiaoI);
                chuiZhiJiaoChanDian1CeHui1CZJMiao.setText(chuiZhiJiaoChanDian1CeHui1CZJMiaoStr);

                /////
                String chuiZhiJiaoChanDian2CeHui1PZDuStr=chuiZhiJiaoChanDian2CeHui1PZDu.getText().toString();
                float chuiZhiJiaoChanDian2CeHui1PZDuF=Float.parseFloat(chuiZhiJiaoChanDian2CeHui1PZDuStr);
                String chuiZhiJiaoChanDian2CeHui1PZFenStr=chuiZhiJiaoChanDian2CeHui1PZFen.getText().toString();
                float chuiZhiJiaoChanDian2CeHui1PZFenF=Float.parseFloat(chuiZhiJiaoChanDian2CeHui1PZFenStr);
                String chuiZhiJiaoChanDian2CeHui1PZMiaoStr=chuiZhiJiaoChanDian2CeHui1PZMiao.getText().toString();
                float chuiZhiJiaoChanDian2CeHui1PZMiaoF=Float.parseFloat(chuiZhiJiaoChanDian2CeHui1PZMiaoStr);

                String chuiZhiJiaoChanDian2CeHui2PZDuStr=chuiZhiJiaoChanDian2CeHui2PZDu.getText().toString();
                float chuiZhiJiaoChanDian2CeHui2PZDuF=Float.parseFloat(chuiZhiJiaoChanDian2CeHui2PZDuStr);
                String chuiZhiJiaoChanDian2CeHui2PZFenStr=chuiZhiJiaoChanDian2CeHui2PZFen.getText().toString();
                float chuiZhiJiaoChanDian2CeHui2PZFenF=Float.parseFloat(chuiZhiJiaoChanDian2CeHui2PZFenStr);
                String chuiZhiJiaoChanDian2CeHui2PZMiaoStr=chuiZhiJiaoChanDian2CeHui2PZMiao.getText().toString();
                float chuiZhiJiaoChanDian2CeHui2PZMiaoF=Float.parseFloat(chuiZhiJiaoChanDian2CeHui2PZMiaoStr);

                String chuiZhiJiaoChanDian2CeHui1PYDuStr=chuiZhiJiaoChanDian2CeHui1PYDu.getText().toString();
                float chuiZhiJiaoChanDian2CeHui1PYDuF=Float.parseFloat(chuiZhiJiaoChanDian2CeHui1PYDuStr);
                String chuiZhiJiaoChanDian2CeHui1PYFenStr=chuiZhiJiaoChanDian2CeHui1PYFen.getText().toString();
                float chuiZhiJiaoChanDian2CeHui1PYFenF=Float.parseFloat(chuiZhiJiaoChanDian2CeHui1PYFenStr);
                String chuiZhiJiaoChanDian2CeHui1PYMiaoStr=chuiZhiJiaoChanDian2CeHui1PYMiao.getText().toString();
                float chuiZhiJiaoChanDian2CeHui1PYMiaoF=Float.parseFloat(chuiZhiJiaoChanDian2CeHui1PYMiaoStr);

                String chuiZhiJiaoChanDian2CeHui2PYDuStr=chuiZhiJiaoChanDian2CeHui2PYDu.getText().toString();
                float chuiZhiJiaoChanDian2CeHui2PYDuF=Float.parseFloat(chuiZhiJiaoChanDian2CeHui2PYDuStr);
                String chuiZhiJiaoChanDian2CeHui2PYFenStr=chuiZhiJiaoChanDian2CeHui2PYFen.getText().toString();
                float chuiZhiJiaoChanDian2CeHui2PYFenF=Float.parseFloat(chuiZhiJiaoChanDian2CeHui2PYFenStr);
                String chuiZhiJiaoChanDian2CeHui2PYMiaoStr=chuiZhiJiaoChanDian2CeHui2PYMiao.getText().toString();
                float chuiZhiJiaoChanDian2CeHui2PYMiaoF=Float.parseFloat(chuiZhiJiaoChanDian2CeHui2PYMiaoStr);

                float chuiZhiJiaoChanDian2CeHui1PZJiaoDu=chuiZhiJiaoChanDian2CeHui1PZDuF+chuiZhiJiaoChanDian2CeHui1PZFenF/60+chuiZhiJiaoChanDian2CeHui1PZMiaoF/3600;
                float chuiZhiJiaoChanDian2CeHui2PZJiaoDu=chuiZhiJiaoChanDian2CeHui2PZDuF+chuiZhiJiaoChanDian2CeHui2PZFenF/60+chuiZhiJiaoChanDian2CeHui2PZMiaoF/3600;
                float chuiZhiJiaoChanDian2CeHui1PYJiaoDu=chuiZhiJiaoChanDian2CeHui1PYDuF+chuiZhiJiaoChanDian2CeHui1PYFenF/60+chuiZhiJiaoChanDian2CeHui1PYMiaoF/3600;
                float chuiZhiJiaoChanDian2CeHui2PYJiaoDu=chuiZhiJiaoChanDian2CeHui2PYDuF+chuiZhiJiaoChanDian2CeHui2PYFenF/60+chuiZhiJiaoChanDian2CeHui2PYMiaoF/3600;

                float chuiZhiJiaoChanDian2CeHui1ZBCJiaoDu=(chuiZhiJiaoChanDian2CeHui1PZJiaoDu+chuiZhiJiaoChanDian2CeHui1PYJiaoDu-360)/2;
                int chuiZhiJiaoChanDian2CeHui1ZBCDuI=(int)chuiZhiJiaoChanDian2CeHui1ZBCJiaoDu;
                String chuiZhiJiaoChanDian2CeHui1ZBCDuStr=String.valueOf(chuiZhiJiaoChanDian2CeHui1ZBCDuI);
                chuiZhiJiaoChanDian2CeHui1ZBCDu.setText(chuiZhiJiaoChanDian2CeHui1ZBCDuStr);
                int chuiZhiJiaoChanDian2CeHui1ZBCFenI=(int)(chuiZhiJiaoChanDian2CeHui1ZBCJiaoDu-chuiZhiJiaoChanDian2CeHui1ZBCDuI)*60;
                String chuiZhiJiaoChanDian2CeHui1ZBCFenStr=String.valueOf(chuiZhiJiaoChanDian2CeHui1ZBCFenI);
                chuiZhiJiaoChanDian2CeHui1ZBCFen.setText(chuiZhiJiaoChanDian2CeHui1ZBCFenStr);
                int chuiZhiJiaoChanDian2CeHui1ZBCMiaoI=(int)((chuiZhiJiaoChanDian2CeHui1ZBCJiaoDu-chuiZhiJiaoChanDian2CeHui1ZBCDuI)*60-chuiZhiJiaoChanDian2CeHui1ZBCFenI)*60;
                String chuiZhiJiaoChanDian2CeHui1ZBCMiaoStr=String.valueOf(chuiZhiJiaoChanDian2CeHui1ZBCMiaoI);
                chuiZhiJiaoChanDian2CeHui1ZBCMiao.setText(chuiZhiJiaoChanDian2CeHui1ZBCMiaoStr);

                float chuiZhiJiaoChanDian2CeHui1CZJJiaoDu=(chuiZhiJiaoChanDian2CeHui1PYJiaoDu-chuiZhiJiaoChanDian2CeHui1PZJiaoDu-180)/2;
                int chuiZhiJiaoChanDian2CeHui1CZJDuI=(int)chuiZhiJiaoChanDian2CeHui1CZJJiaoDu;
                String chuiZhiJiaoChanDian2CeHui1CZJDuStr=String.valueOf(chuiZhiJiaoChanDian2CeHui1CZJDuI);
                chuiZhiJiaoChanDian2CeHui1CZJDu.setText(chuiZhiJiaoChanDian2CeHui1CZJDuStr);
                int chuiZhiJiaoChanDian2CeHui1CZJFenI=(int)(chuiZhiJiaoChanDian2CeHui1CZJJiaoDu-chuiZhiJiaoChanDian2CeHui1CZJDuI)*60;
                String chuiZhiJiaoChanDian2CeHui1CZJFenStr=String.valueOf(chuiZhiJiaoChanDian2CeHui1CZJFenI);
                chuiZhiJiaoChanDian2CeHui1CZJFen.setText(chuiZhiJiaoChanDian2CeHui1CZJFenStr);
                int chuiZhiJiaoChanDian2CeHui1CZJMiaoI=(int)((chuiZhiJiaoChanDian2CeHui1CZJJiaoDu-chuiZhiJiaoChanDian2CeHui1CZJDuI)*60-chuiZhiJiaoChanDian2CeHui1CZJFenI);
                String chuiZhiJiaoChanDian2CeHui1CZJMiaoStr=String.valueOf(chuiZhiJiaoChanDian2CeHui1CZJMiaoI);
                chuiZhiJiaoChanDian2CeHui1CZJMiao.setText(chuiZhiJiaoChanDian2CeHui1CZJMiaoStr);

                ////
                String bianChang1DuShu1Str=bianChang1DuShu1.getText().toString();
                float bianChang1DuShu1F=Float.parseFloat(bianChang1DuShu1Str);
                String bianChang1DuShu2Str=bianChang1DuShu2.getText().toString();
                float bianChang1DuShu2F=Float.parseFloat(bianChang1DuShu2Str);
                String bianChang1DuShu3Str=bianChang1DuShu3.getText().toString();
                float bianChang1DuShu3F=Float.parseFloat(bianChang1DuShu3Str);
                String bianChang1DuShu4Str=bianChang1DuShu4.getText().toString();
                float bianChang1DuShu4F=Float.parseFloat(bianChang1DuShu4Str);

                float bianChang1PJZNum=(bianChang1DuShu1F+bianChang1DuShu2F+bianChang1DuShu3F+bianChang1DuShu4F)/4;
                String bianChang1PJZStr=String.valueOf(bianChang1PJZNum);
                bianChang1PJZ.setText(bianChang1PJZStr);
                ///
                String bianChang2DuShu1Str=bianChang2DuShu1.getText().toString();
                float bianChang2DuShu1F=Float.parseFloat(bianChang2DuShu1Str);
                String bianChang2DuShu2Str=bianChang2DuShu2.getText().toString();
                float bianChang2DuShu2F=Float.parseFloat(bianChang2DuShu2Str);
                String bianChang2DuShu3Str=bianChang2DuShu3.getText().toString();
                float bianChang2DuShu3F=Float.parseFloat(bianChang2DuShu3Str);
                String bianChang2DuShu4Str=bianChang2DuShu4.getText().toString();
                float bianChang2DuShu4F=Float.parseFloat(bianChang2DuShu4Str);

                float bianChang2PJZNum=(bianChang2DuShu1F+bianChang2DuShu2F+bianChang2DuShu3F+bianChang2DuShu4F)/4;
                String bianChang2PJZStr=String.valueOf(bianChang2PJZNum);
                bianChang2PJZ.setText(bianChang2PJZStr);






                /*String s1=a.getText().toString();
                String s2=b.getText().toString();
                float f1=Float.parseFloat(s1);
                float f2=Float.parseFloat(s2);


                float f3=f1+f2;
                String s3=String.valueOf(f3);

                /*String result = edit.getText().toString();*/
                /*int i = Integer.parseInt([String]); */
                /*b = (byte) a;*/
                /*c.setText(s3);*/

            }
        });
    }
}
