package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class CN1 extends AbstractC6067Dv5 implements Handler.Callback {
    public List<CN2> A00;
    public final Handler A01;
    public final DA1 A02;

    public CN1(Looper looper, InterfaceC5404Dhx interfaceC5404Dhx, DA1 da1, String str) throws JSONException {
        super(new C5401Dhu(looper, interfaceC5404Dhx, da1));
        this.A01 = looper == null ? null : new Handler(looper, this);
        this.A02 = da1;
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            ArrayList arrayListA0h = C3cG.A0h();
            JSONArray jSONArray = BV4.A19(str).getJSONObject("trackCompositions").getJSONArray("4");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i).getJSONObject("dataTrack");
                String string = jSONObject.getString("trackName");
                JSONObject jSONObjectA19 = BV4.A19(jSONObject.getString("trackDataJson"));
                String string2 = jSONObjectA19.getString("stickerType");
                String string3 = jSONObjectA19.getString("stickerAssetId");
                C7384Etj.A0X(string2);
                C7384Etj.A0X(string3);
                CN4 cn4 = new CN4();
                JSONArray jSONArray2 = jSONObject.getJSONArray("dataSegments");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    jSONObject2.getJSONObject("timeRange").getJSONObject("startTime").getLong("timeValue");
                    jSONObject2.getJSONObject("timeRange").getJSONObject("endTime").getLong("timeValue");
                    JSONObject jSONObjectA192 = BV4.A19(jSONObject2.getString("segmentDataJson"));
                    C7384Etj.A0X(string);
                    jSONObjectA192.getDouble("relativeX");
                    jSONObjectA192.getDouble("relativeY");
                    jSONObjectA192.getDouble("relativeWidth");
                    jSONObjectA192.getDouble("relativeHeight");
                    jSONObjectA192.getDouble("rotationDegrees");
                    arrayListA0h.add(new CN2(new CN3(), cn4));
                }
            }
            this.A00 = arrayListA0h;
        } catch (JSONException unused) {
            CFK.A04("HeroMetadataRenderer", "Error in parsing IMF spec");
        }
    }

    @Override // X.AbstractC6067Dv5, X.InterfaceC6068Dv6
    public final void Aaz(long j, long j2) {
        List<CN2> list = this.A00;
        if (list != null) {
            UUID uuid = AbstractC5400Dhr.A04;
            long jA0B = Util.A0B(j);
            Handler handler = this.A01;
            if (handler != null) {
                BV6.A10(handler, Long.valueOf(jA0B), 1);
            } else {
                Iterator<CN2> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
        super.Aaz(j, j2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<CN2> list;
        if (message.what != 1) {
            throw BV4.A0T();
        }
        if (message.obj != null && (list = this.A00) != null) {
            Iterator<CN2> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        return true;
    }
}
