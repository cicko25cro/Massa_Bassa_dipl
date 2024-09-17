package com.example.massa_bassa_dipl;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.graphics.Typeface;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class StepsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);

        LinearLayout stepsContainer = findViewById(R.id.stepsContainer);

        Intent intent = getIntent();
        String item = intent.getStringExtra("item");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(item);

        List<SpannableString> steps = new ArrayList<>();
        List<Integer> images = new ArrayList<>();

        switch (item) {
            case "How to build an enclosure?":
                String title = "How to build an enclosure? Step By Step Tutorial \n ";
                SpannableString title2 = new SpannableString(title);
                title2.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                title2.setSpan(new RelativeSizeSpan(1.2f), 0, title.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(title2);

                String speaker_step1 = "Step 1: Determine the size of the speaker box.";
                SpannableString spannableStep_1 = new SpannableString(speaker_step1);
                spannableStep_1.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step1.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_1);
                images.add(R.drawable.box_step1);

                String speaker_step2 = "Step 2: Check the internal volume against the manufacturer’s recommended speaker box internal volume.";
                SpannableString spannableStep_2 = new SpannableString(speaker_step2);
                spannableStep_2.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step2.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_2);
                images.add(R.drawable.box_step222);

                String speaker_step3 = "Step 3: Add the thickness of the wood to your dimensions to figure the box’s external dimensions.";
                SpannableString spannableStep_3 = new SpannableString(speaker_step3);
                spannableStep_3.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step3.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_3);
                images.add(R.drawable.box_step2);

                String speaker_step4 = "Step 4: Measure the height, width and depth of the space available for the speaker box to be sure the box will fit.";
                SpannableString spannableStep_4 = new SpannableString(speaker_step4);
                spannableStep_4.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step4.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_4);
                images.add(R.drawable.box_step3);

                String speaker_step5 = "Step 5: Construct the speaker box.";
                SpannableString spannableStep_5 = new SpannableString(speaker_step5);
                spannableStep_5.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step5.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_5);
                images.add(R.drawable.box_step4);

                String speaker_step6 = "Step 6: Brace the speaker box with 1-inch x 1-inch (2-1/2 cm x 2-1/2 cm) strips of wood (battens).";
                SpannableString spannableStep_6 = new SpannableString(speaker_step6);
                spannableStep_6.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step6.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_6);
                images.add(R.drawable.box_step5);

                String speaker_step7 = "Step 7: Fit the cut pieces together to make sure they match up.";
                SpannableString spannableStep_7 = new SpannableString(speaker_step7);
                spannableStep_7.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step7.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_7);
                images.add(R.drawable.box_step6);

                String speaker_step8 = "Step 8: Pre-drill all holes and bead carpenter’s glue along each joint as you assemble the box.";
                SpannableString spannableStep_8 = new SpannableString(speaker_step8);
                spannableStep_8.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step8.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_8);
                images.add(R.drawable.box_step7);

                String speaker_step9 = "Step 9: Place the speaker in the box and check that it fits.";
                SpannableString spannableStep_9 = new SpannableString(speaker_step9);
                spannableStep_9.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step9.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_9);
                images.add(R.drawable.box_step8);

                String speaker_step10 = "Step 10: Mark the mounting screw holes while the speaker is in the box.";
                SpannableString spannableStep_10 = new SpannableString(speaker_step10);
                spannableStep_10.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step10.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_10);
                images.add(R.drawable.box_step9);

                String speaker_step11 = "Step 11: Apply silicon caulk over the speaker box’s internal seams and all openings to ensure the box is airtight.";
                SpannableString spannableStep_11 = new SpannableString(speaker_step11);
                spannableStep_11.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step11.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_11);
                images.add(R.drawable.box_step11);

                String speaker_step12 = "Step 12: Set up the speaker box.";
                SpannableString spannableStep_12 = new SpannableString(speaker_step12);
                spannableStep_12.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step12.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_12);
                images.add(R.drawable.box_step13);
                break;

            case "How to tune your amplifier?":
                String title8 = "How to tune your amplifier? Step By Step Tutorial \n ";
                SpannableString title9 = new SpannableString(title8);
                title9.setSpan(new StyleSpan(Typeface.BOLD), 0, title8.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                title9.setSpan(new RelativeSizeSpan(1.2f), 0, title8.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(title9);

                String amplifier_step1 = "Step 1: Set the volume to zero on your car stereo.";
                SpannableString spannableStep_121 = new SpannableString(amplifier_step1);
                spannableStep_121.setSpan(new StyleSpan(Typeface.BOLD), 0, amplifier_step1.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_121);
                images.add(R.drawable.amplifier_step1);

                String amplifier_step2 = "Step 2: Turn the gain on your amplifier all the way down.";
                SpannableString spannableStep_122 = new SpannableString(amplifier_step2);
                spannableStep_122.setSpan(new StyleSpan(Typeface.BOLD), 0, amplifier_step2.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_122);
                images.add(R.drawable.amplifier_step2);

                String amplifier_step3 = "Step 3: Power up your stereo and either play a CD or a radio station, preferably a high quality track or test tone.";
                SpannableString spannableStep_123 = new SpannableString(amplifier_step3);
                spannableStep_123.setSpan(new StyleSpan(Typeface.BOLD), 0, amplifier_step3.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_123);
                images.add(R.drawable.amplifier_step3);

                String amplifier_step4 = "Step 4: Turn the stereo up to 2/3 the max volume. This is the best range to use when setting gain because you avoid overworking the stereo head.";
                SpannableString spannableStep_124 = new SpannableString(amplifier_step4);
                spannableStep_124.setSpan(new StyleSpan(Typeface.BOLD), 0, amplifier_step4.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_124);
                images.add(R.drawable.amplifier_step4);

                String amplifier_step5 = "Step 5: Twist the gain dial on your amplifier. Turn it up until the sound is as loud as you might ever want to listen to it, so long as you do not hear any sound distortion or overload your speakers.";
                SpannableString spannableStep_125 = new SpannableString(amplifier_step5);
                spannableStep_125.setSpan(new StyleSpan(Typeface.BOLD), 0, amplifier_step5.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_125);
                images.add(R.drawable.amplifier_step5);

                String amplifier_step6 = "Step 6: Adjust your volume to a normal level.";
                SpannableString spannableStep_126 = new SpannableString(amplifier_step6);
                spannableStep_126.setSpan(new StyleSpan(Typeface.BOLD), 0, amplifier_step6.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_126);
                images.add(R.drawable.amplifier_step6);
                break;

            case "How to install your car speakers?":
                String title3 = "How to install your car speakers? Step By Step Tutorial \n ";
                SpannableString title4 = new SpannableString(title3);
                title4.setSpan(new StyleSpan(Typeface.BOLD), 0, title3.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                title4.setSpan(new RelativeSizeSpan(1.2f), 0, title4.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(title4);

                String speaker_step111 = "Step 1: Check your vehicle’s audio specifications to see what type of system it came equipped with.";
                SpannableString spannableStep_111 = new SpannableString(speaker_step111);
                spannableStep_111.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step111.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_111);
                images.add(R.drawable.speakers_step1);

                String speaker_step222 = "Step 2: Consider speaker material quality, select speakers and if necessary speaker adapters.";
                SpannableString spannableStep_222 = new SpannableString(speaker_step222);
                spannableStep_222.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step222.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_222);
                images.add(R.drawable.speakers_step2);

                steps.add(new SpannableString("Step 2.1: Look at the electronic characteristics and consider the power requirements of new speakers."));
                images.add(R.drawable.speakers_step2_1);
                steps.add(new SpannableString("Step 2.2: Look at the electronic characteristics of new speakers."));
                images.add(R.drawable.speakers_step2_3);
                steps.add(new SpannableString("Step 2.3: Consider the power requirements of new speakers."));
                images.add(R.drawable.speakers_step2_2);

                String speaker_step333 = "Step 3: Getting ready to install new speakers, gather your tools.";
                SpannableString spannableStep_333 = new SpannableString(speaker_step333);
                spannableStep_333.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step333.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_333);
                images.add(R.drawable.speakers_step3);
                steps.add(new SpannableString("Step 3.1: Ensure that the speakers you've chosen fit your car."));
                images.add(R.drawable.speakers_step3_1);

                String speaker_step444 = "Step 4: Installing new speakers. First, take the door grills or, if needed, panels off.";
                SpannableString spannableStep_444 = new SpannableString(speaker_step444);
                spannableStep_444.setSpan(new StyleSpan(Typeface.BOLD), 0, speaker_step444.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(spannableStep_444);
                images.add(R.drawable.speakers_step4);
                steps.add(new SpannableString("Step 4.1: Disconnect and remove the old speaker/s."));
                images.add(R.drawable.speakers_step4_1);
                steps.add(new SpannableString("Step 4.2: Put aside the old, connect and insert new speakers."));
                images.add(R.drawable.speakers_step4_3);
                steps.add(new SpannableString("Step 4.3: Test new speakers."));
                images.add(R.drawable.speakers_step4_4);
                steps.add(new SpannableString("Step 4.4: If everything works correctly, install back panels and/or speaker grills."));
                images.add(R.drawable.speakers_step4_2);
                steps.add(new SpannableString("\n Good job! If everything works as intended, you successfully installed your first set of speakers! \n "));
                break;

            case "How to wire a car stereo?":
                String title5 = "How to wire a car stereo? Step By Step Tutorial \n ";
                SpannableString title6 = new SpannableString(title5);
                title6.setSpan(new StyleSpan(Typeface.BOLD), 0, title5.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                title6.setSpan(new RelativeSizeSpan(1.2f), 0, title5.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(title6);

                String wire_step1 = "Step 1: Disconnect the battery leads from the battery itself.";
                SpannableString wireSpan1 = new SpannableString(wire_step1);
                wireSpan1.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step1.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan1);
                images.add(R.drawable.wire_step1);

                String wire_step2 = "Step 2: Remove any necessary pieces of trim to gain access to the sides of the stock head unit in the center console";
                SpannableString wireSpan2 = new SpannableString(wire_step2);
                wireSpan2.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step2.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan2);
                images.add(R.drawable.wire_step2);

                String wire_step3 = "Step 3: Determine how your head unit is mounted.";
                SpannableString wireSpan3 = new SpannableString(wire_step3);
                wireSpan3.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step3.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan3);
                images.add(R.drawable.wire_step3);

                String wire_step4 = "Step 4: Use DIN tools to remove spring clipped stereos.";
                SpannableString wireSpan4 = new SpannableString(wire_step4);
                wireSpan4.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step4.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan4);
                images.add(R.drawable.wire_step4);

                String wire_step5 = "Step 5: Remove a bolted in stereo with wrenches.";
                SpannableString wireSpan5 = new SpannableString(wire_step5);
                wireSpan5.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step5.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan5);
                images.add(R.drawable.wire_step5);

                String wire_step6 = "Step 6: Disconnect the wiring";
                SpannableString wireSpan6= new SpannableString(wire_step6);
                wireSpan6.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step6.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan6);
                images.add(R.drawable.wire_step6);

                String wire_step7 = "Step 7: Wiring the new stereo, \nFirst, purchase (if it wasn't included already) a wiring adaptor for your car";
                SpannableString wireSpan7 = new SpannableString(wire_step7);
                wireSpan7.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step7.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan7);
                images.add(R.drawable.wire_step7);

                String wire_step8 = "Step 8: Identify and connect loose wiring.";
                SpannableString wireSpan8 = new SpannableString(wire_step8);
                wireSpan8.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step8.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan8);
                images.add(R.drawable.wire_step8);

                String wire_step9 = "Step 9: Connect the output convertor (if necessary).";
                SpannableString wireSpan9 = new SpannableString(wire_step9);
                wireSpan9.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step9.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan9);
                images.add(R.drawable.wire_step9);

                String wire_step10 = "Step 10: Secure all connected wires. \nBe sure there is no bare wire metal showing from any of the wire connections by wrapping them in electric tape or heat-shrink wrap.";
                SpannableString wireSpan10 = new SpannableString(wire_step10);
                wireSpan10.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step10.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan10);
                images.add(R.drawable.wire_step10);

                String wire_step11 = "Step 11: Test the stereo, make sure all speakers in your vehicle are working and that CDs or your MP3 player play properly.";
                SpannableString wireSpan11 = new SpannableString(wire_step11);
                wireSpan11.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step11.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan11);
                images.add(R.drawable.wire_step11);

                String wire_step12 = "Step 12: Tuck all of the wiring into the dashboard. \nBe careful not to pull any wires out of the back of the stereo as you tuck them back into the dash board. \nTry not to let the wiring get in the way of the bracket you will need to bolt the stereo too (if your stereo requires being bolted into place).";
                SpannableString wireSpan12 = new SpannableString(wire_step12);
                wireSpan12.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step12.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan12);
                images.add(R.drawable.wire_step12);

                String wire_step13 = "Step 13: Slowly slide the radio back into the opening in the center console of the vehicle while being careful not to apply too much pressure to the face of it.";
                SpannableString wireSpan13 = new SpannableString(wire_step13);
                wireSpan13.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step13.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan13);
                images.add(R.drawable.wire_step13);

                String wire_step14 = "Step 14: Secure the new stereo. If you had to use an adaptor to properly fit the stereo in its space in the console, ensure the stereo is secured to the adaptor and that the adaptor is secured to the car.";
                SpannableString wireSpan14 = new SpannableString(wire_step14);
                wireSpan14.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step14.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan14);
                images.add(R.drawable.wire_step14);

                String wire_step15 = "Step 15: Reinstall the trim. \nBe careful not to break any of the plastic clips that hold the trim in place, reinstall each piece in the opposite order you removed them.";
                SpannableString wireSpan15 = new SpannableString(wire_step15);
                wireSpan15.setSpan(new StyleSpan(Typeface.BOLD), 0, wire_step15.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                steps.add(wireSpan15);
                images.add(R.drawable.wire_step15);
                break;

        }

        for (int i = 0; i < steps.size(); i++) {
            TextView stepTextView = new TextView(this);
            stepTextView.setText(steps.get(i));
            stepTextView.setTextSize(18);
            stepTextView.setTextColor(getResources().getColor(android.R.color.white));
            stepTextView.setPadding(0, 16, 0, 16);

            if (i < images.size()) {
                ImageView stepImageView = new ImageView(this);
                stepImageView.setImageResource(images.get(i));
                stepImageView.setAdjustViewBounds(true);
                stepImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                stepImageView.setPadding(0, 0, 0, 32);
                stepsContainer.addView(stepTextView);
                stepsContainer.addView(stepImageView);
            } else {
                stepsContainer.addView(stepTextView);
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
