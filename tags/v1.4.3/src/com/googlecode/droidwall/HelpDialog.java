/**
 * Dialog displayed when the "Help" menu option is selected
 * 
 * Copyright (C) 2009-2010  Rodrigo Zechin Rosauro
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @author Rodrigo Zechin Rosauro
 * @version 1.0
 */
package com.googlecode.droidwall;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

/**
 * Dialog displayed when the "Help" menu option is selected
 */
public class HelpDialog extends AlertDialog {
	protected HelpDialog(Context context) {
		super(context);
		final View view = getLayoutInflater().inflate(R.layout.help_dialog, null);
		setButton(context.getText(R.string.close), (OnClickListener)null);
		setIcon(R.drawable.icon);
		setTitle("DroidWall v" + Api.VERSION);
		setView(view);
	}
	protected HelpDialog(final Context context, boolean oldVersionWarn) {
		super(context);
		final View view = getLayoutInflater().inflate(R.layout.oldverwarn_dialog, null);
		setButton("I will update later", (OnClickListener)null);
		setIcon(R.drawable.icon);
		setTitle("Version warning");
		Button btn = (Button) view.findViewById(R.id.btn_oldver_openmarket);
		if (btn != null) {
			btn.setOnClickListener(new View.OnClickListener() {
	             public void onClick(View v) {
	            	 String url = "market://search?q=pname:com.googlecode.droidwall.free";
	            	 Intent i = new Intent(Intent.ACTION_VIEW);
	            	 i.setData(Uri.parse(url));
	            	 context.startActivity(i);
	             }
	         });
		}
		btn = (Button) view.findViewById(R.id.btn_oldver_remove);
		if (btn != null) {
			btn.setOnClickListener(new View.OnClickListener() {
	             public void onClick(View v) {
	            	 String url = "market://search?q=pname:com.googlecode.droidwall";
	            	 Intent i = new Intent(Intent.ACTION_VIEW);
	            	 i.setData(Uri.parse(url));
	            	 context.startActivity(i);
	             }
	         });
		}
		setView(view);
	}
}
