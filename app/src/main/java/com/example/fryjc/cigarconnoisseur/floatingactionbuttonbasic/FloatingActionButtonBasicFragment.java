/*
 * Copyright 2014, The Android Open Source Project
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

package com.example.fryjc.cigarconnoisseur.floatingactionbuttonbasic;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.fryjc.cigarconnoisseur.R;


/**
 * This fragment inflates a layout with two Floating Action Buttons and acts as a listener to
 * changes on them.
 */
public class FloatingActionButtonBasicFragment extends Fragment{

    private final static String TAG = "FloatingActionButtonBasicFragment";
    private FloatingActionButton mfab1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fab_layout, container, false);

        // Make this {@link Fragment} listen for changes in both FABs.
        this.mfab1 = (FloatingActionButton) rootView.findViewById(R.id.fab_1);
        mfab1.setOnCheckedChangeListener((FloatingActionButton.OnCheckedChangeListener) getActivity());
        return rootView;
    }

    public void toggleButton(){
        this.mfab1.toggle();
    }


}
