package com.ivy.citypicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.ivy.citypicker.adapter.AddressHelper;

public class MainActivity extends AppCompatActivity {

    private Spinner sp_province;
    private Spinner sp_city;
    private Spinner sp_county;
    private Button btn_get_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp_province = (Spinner) findViewById(R.id.sp_province);
        sp_city = (Spinner) findViewById(R.id.sp_city);
        sp_county = (Spinner) findViewById(R.id.sp_county);
        btn_get_address = (Button) findViewById(R.id.btn_get_address);

        AddressHelper.loadSpinner(this, sp_province, sp_city, sp_county);

        btn_get_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "你选择了：" + sp_province.getSelectedItem().toString() + "-" + sp_city.getSelectedItem().toString() + "-" + sp_county.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
