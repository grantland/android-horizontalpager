package com.deezapps.widget;

/*
 * Copyright (C) 2010 Deez Apps!
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * User: jeanguy@gmail.com
 * Date: Aug 8, 2010
 */
public class TestActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final PagerControl control = (PagerControl) findViewById(R.id.control);
        final HorizontalPager pager = (HorizontalPager) findViewById(R.id.pager);
        control.setNumPages(pager.getChildCount());

        pager.addOnScrollListener(new HorizontalPager.OnScrollListener() {
            public void onScroll(int scrollX) {
                //Log.d("TestActivity", "scrollX=" + scrollX);
                float scale = (float) (pager.getPageWidth() * pager.getChildCount()) / (float) control.getWidth();
                control.setPosition((int) (scrollX / scale));
            }

            public void onViewScrollFinished(int currentPage) {
                //Log.d("TestActivity", "viewIndex=" + currentPage);
                control.setCurrentPage(currentPage);
            }
        });

        Button b = (Button) findViewById(R.id.left);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                pager.scrollLeft();
            }
        });
        b = (Button) findViewById(R.id.right);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                pager.scrollRight();
            }
        });


    }
}
