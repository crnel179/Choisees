package lcrnelu179.choisees;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    // declaring variables
    private TextView mTVStory;
    private Button mBtnTop;
    private Button mBtnBottom;
    private int mIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // links between the .java and .xml widgets set
        mTVStory = findViewById(R.id.tvStory);
        mBtnTop = findViewById(R.id.btnTop);
        mBtnBottom = findViewById(R.id.btnBottom);

        mBtnTop.setOnClickListener(this);
        mBtnBottom.setOnClickListener(this);
    }

    // on click/tap events set
    @Override
    public void onClick(View view) {
        if (mIndex == 1) {
            t1_story();
        }
        else if (mIndex == 2) {
            t2_story();
        }
        else {
            t3_story();
        }

    }

    // methods with the story choices' mechanics
    public void t1_story() {
        if(mBtnTop.isPressed()) {
            mTVStory.setText(R.string.T3_Story);
            mBtnTop.setText(R.string.T3_Ans1);
            mBtnBottom.setText(R.string.T3_Ans2);
            mIndex = 3;
        }
        else {
            mTVStory.setText(R.string.T2_Story);
            mBtnTop.setText(R.string.T2_Ans1);
            mBtnBottom.setText(R.string.T2_Ans2);
            mIndex = 2;
        }
    }

    public void t2_story() {
        if (mBtnTop.isPressed()) {
            mTVStory.setText(R.string.T3_Story);
            mBtnTop.setText(R.string.T3_Ans1);
            mBtnBottom.setText(R.string.T3_Ans2);
            mIndex = 3;
        }
        else {
            mTVStory.setText(R.string.T4_End);
            mBtnTop.setVisibility(View.GONE);
            mBtnBottom.setVisibility(View.GONE);
        }
    }

    public void t3_story() {
        if (mBtnTop.isPressed()) {
            mTVStory.setText(R.string.T6_End);
            mBtnTop.setVisibility(View.GONE);
            mBtnBottom.setVisibility(View.GONE);
        }
        else {
            mTVStory.setText(R.string.T5_End);
            mBtnTop.setVisibility(View.GONE);
            mBtnBottom.setVisibility(View.GONE);
        }
    }
}