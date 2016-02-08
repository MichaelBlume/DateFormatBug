package climate.dateformatbug

import android.text.format.DateFormat

/**
 * Created by michael.blume on 2/8/16.
 */

val df = DateFormat()

fun hello() {
    df.format("foo", 25L)
}