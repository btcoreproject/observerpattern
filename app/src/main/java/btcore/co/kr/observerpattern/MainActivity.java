package btcore.co.kr.observerpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static void main(String[] args){
        NewsMachine newsMachine = new NewsMachine();
        AnnualSubscriber as = new AnnualSubscriber(newsMachine);
        EventSubscriber es = new EventSubscriber(newsMachine);

        newsMachine.setNewsInfo("오늘 한파", "전국 영하 18도 입니다.");
        newsMachine.setNewsInfo("벛꽃 축제합니다", "다같이 버꽃보러 ~");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
