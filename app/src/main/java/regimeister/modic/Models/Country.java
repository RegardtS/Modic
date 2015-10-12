package regimeister.modic.Models;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

/**
 * Created by regardtschindler on 15/10/12.
 */
public class Country {

    private String name;
    private String countryCode;
    private Drawable flag;

    public Country(Context context,String name,String countryCode, int flag) {
        this.name = name;
        this.countryCode = countryCode;
        this.flag = ContextCompat.getDrawable(context, flag);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getFlag() {
        return flag;
    }

    public void setFlag(Drawable flag) {
        this.flag = flag;
    }
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
