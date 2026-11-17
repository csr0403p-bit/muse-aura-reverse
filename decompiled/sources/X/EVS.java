package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.Map;
import org.maplibre.android.R;

/* loaded from: classes5.dex */
public final class EVS extends AbstractC6676EOt implements C7NB, HtC {
    public final int $t;

    public final /* bridge */ /* synthetic */ void A04(Map map) {
        this.A00.A3g(AbstractC7606F5t.A00(3), map);
    }

    public EVS(Eu1 eu1, int i) {
        this.$t = i;
        this.A00 = eu1;
    }

    @Override // X.AbstractC6676EOt, X.C7NB
    public final void APu() {
        switch (this.$t) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
            case 42:
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
            case 50:
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
            case 63:
                String str = EnumC7397Eua.ANDROID.mValue;
                C7384Etj.A0U(str);
                A03("platform", str);
                A02("actual_event_time", C60O.A0k());
                super.APu();
                break;
            case 21:
            case 22:
            case 23:
                A03("session_id", EVX.A00);
                String str2 = EVW.A00.mValue;
                C7384Etj.A0U(str2);
                A03("product_type", str2);
                String str3 = EnumC7397Eua.ANDROID.mValue;
                C7384Etj.A0U(str3);
                A03("platform", str3);
                A02("actual_event_time", C60O.A0k());
                super.APu();
                break;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
            case 40:
            case 44:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
            case 48:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
            default:
                super.APu();
                break;
        }
    }
}
