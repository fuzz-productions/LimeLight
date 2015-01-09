/**
 This Source Code Form is subject to the terms of the Mozilla Public
 License, v. 2.0, as well as to the Additional Term regarding proper
 attribution. The latter is located in Term 11 of the License.
 If a copy of the MPL with the Additional Term was not distributed
 with this file, You can obtain one at http://static.fuzzhq.com/licenses/MPL
 */

package com.fuzz.android.limelight.recorder.widget.drag;

import android.view.View;

/**
 * @author William Xu (Fuzz)
 */
interface OffSetChangeListener {
    void onOffSetChange(View v, float x, float y);
}
