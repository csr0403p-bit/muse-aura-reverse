package X;

import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

/* loaded from: classes4.dex */
public final class BUS extends AbstractC7559F3s implements Function0 {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BUS(int i) {
        super(0);
        this.$t = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        Choreographer choreographer;
        String str2;
        switch (this.$t) {
            case 0:
            case 2:
            case 7:
            case 29:
                return AnonymousClass001.A0i();
            case 1:
            case 12:
            case 14:
            case 23:
            case 24:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
            case 42:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
            default:
                return null;
            case 3:
            case 4:
            case 5:
            case 6:
                return AnonymousClass005.A0a();
            case 8:
                return C8j3.A0k(48.0f);
            case 9:
            case 40:
                return AnonymousClass001.A0h();
            case 10:
                return new C2174B0s(new PathMeasure());
            case 11:
            case 48:
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return Unit.INSTANCE;
            case 13:
            case 15:
                return new C1453AjM(true, ARD.A00.addAndGet(1));
            case 16:
                return new C1453AjM(false, ARD.A00.addAndGet(1));
            case 17:
                str = "LocalConfiguration";
                break;
            case 18:
                str = "LocalContext";
                break;
            case 19:
                str = "LocalImageVectorCache";
                break;
            case 20:
                str = "LocalResourceIdCache";
                break;
            case 21:
                str = "LocalView";
                break;
            case 22:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    GBK gbk = AbstractC9266GBt.A00;
                    choreographer = (Choreographer) AbstractC9245GAx.A00(AbstractC7429Evm.A00, new BCL(2, null));
                }
                C2119Ayk c2119Ayk = new C2119Ayk(Handler.createAsync(Looper.getMainLooper()), choreographer);
                return C78W.A02(c2119Ayk, c2119Ayk.A06);
            case 25:
                str2 = "LocalAutofillManager";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case 26:
                str2 = "LocalAutofillTree";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case 27:
                str2 = "LocalClipboard";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case 28:
                str2 = "LocalClipboardManager";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case 30:
                str2 = "LocalDensity";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case 31:
                str2 = "LocalFocusManager";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case 32:
                str2 = "LocalFontFamilyResolver";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case 33:
                str2 = "LocalFontLoader";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case 34:
                str2 = "LocalGraphicsContext";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case 35:
                str2 = "LocalHapticFeedback";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case 36:
                str2 = "LocalInputManager";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                str2 = "LocalLayoutDirection";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                str2 = "LocalProvidableLocaleList";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                str2 = "LocalTextToolbar";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case 44:
                str2 = "LocalUriHandler";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                str2 = "LocalViewConfiguration";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                str2 = "LocalWindowInfo";
                throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str2, " not present"));
        }
        throw C3cG.A0Q(FGI.A0U("CompositionLocal ", str, " not present"));
    }
}
