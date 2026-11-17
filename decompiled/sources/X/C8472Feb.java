package X;

import android.content.res.Resources;
import com.facebook.rsys.execution.simplethread.gen.SimpleThreadTaskExecutor;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

/* renamed from: X.Feb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8472Feb extends AbstractC7559F3s implements Function0 {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8472Feb(int i) {
        super(0);
        this.$t = i;
    }

    public static C8472Feb A00(int i) {
        return new C8472Feb(i);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        int identifier;
        switch (this.$t) {
            case 0:
            case 3:
                return "Cannot pop Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().";
            case 1:
                return "Cannot push Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().";
            case 2:
                return "Cannot pop Screen content with an empty CDS bottom sheet or full screen.";
            case 4:
                AbstractC7724FCa.A00 = null;
                return Unit.INSTANCE;
            case 5:
            case 36:
                return AnonymousClass001.A0h();
            case 6:
            case 7:
            default:
                return null;
            case 8:
                return AbstractC8175FXr.A00("setShiftDrawingOffsetForStartOverhang");
            case 9:
                return AbstractC8175FXr.A00("setUseBoundsForWidth");
            case 10:
                return BV5.A0j();
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
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return Unit.INSTANCE;
            case 32:
                return C3cG.A0h();
            case 33:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return FGO.A00;
            case 34:
                boolean z = FFH.A00;
                return null;
            case 35:
                return C60O.A11(4);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return C78W.A05(new C8eO(null), AbstractC9266GBt.A00);
            case 40:
                return GRH.A02;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return SimpleThreadTaskExecutor.CProxy.createTaskExecutor("rsys-signaling");
            case 42:
                Resources system = Resources.getSystem();
                try {
                    identifier = system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", "android");
                } catch (RuntimeException unused) {
                }
                int integer = identifier != 0 ? system.getInteger(identifier) : -1;
                return Integer.valueOf(integer);
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
            case 44:
                return C60O.A0k();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return new FAJ();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return new FEL();
            case 48:
                return new FCN();
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return new ConcurrentHashMap(2);
        }
    }
}
