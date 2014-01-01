/*
 * Copyright 2013 Peng fei Pan
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.xiaopan.easy.imageloader.sample.fragment;

import me.xiaopan.easy.imageloader.sample.adapter.ImageAdapter;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class GridFragment extends Fragment {
	public static final String PARAM_REQUIRED_STRING_ARRAY_URLS = "PARAM_REQUIRED_STRING_ARRAY_URLS";
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		GridView gridView = new GridView(getActivity());
		gridView.setBackgroundColor(Color.BLACK);
		gridView.setPadding(0, 0, 0, 0);
		gridView.setNumColumns(3);
		gridView.setVerticalSpacing(2);
		gridView.setHorizontalSpacing(2);
		gridView.setAdapter(new ImageAdapter(getActivity(), getArguments().getStringArray(PARAM_REQUIRED_STRING_ARRAY_URLS), 3));
		return gridView;
	}
}