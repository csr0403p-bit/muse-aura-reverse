package X;

import com.whatsapp.accountlinking.ipc.api.models.ContextualUnpauseResult;
import com.whatsapp.accountlinking.ipc.api.models.CreateAcUserAndRecordDisclosureOperation;
import com.whatsapp.accountlinking.ipc.api.models.CreateAcUserAndRecordDisclosureResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.GetEncryptedProfileInfoOperation;
import com.whatsapp.accountlinking.ipc.api.models.GetEncryptedProfileInfoOperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.GetFeatureEligibilityOperation;
import com.whatsapp.accountlinking.ipc.api.models.GetFeatureEligibilityResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.GetRegisteredPhoneNumberOperationResultSuccess;
import com.whatsapp.accountlinking.ipc.api.models.IpcFeature;
import com.whatsapp.accountlinking.ipc.api.models.OperationResult;
import com.whatsapp.accountlinking.ipc.api.models.OperationResultError;
import com.whatsapp.accountlinking.ipc.api.models.UseCase;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

/* renamed from: X.BSj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2283BSj implements Ht9, Function0 {
    public final int $t;

    public C2283BSj(int i) {
        this.$t = i;
    }

    public static C2283BSj A00(BFM bfm, int i) {
        C2283BSj c2283BSj = new C2283BSj(i);
        bfm.Ai0(c2283BSj);
        return c2283BSj;
    }

    public static F0C A01(Integer num, int i) {
        return AbstractC5321DgF.A02(num, new C2283BSj(i));
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
            case 23:
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
                return Unit.INSTANCE;
            case 1:
            case 3:
            case 6:
            case 9:
            case 10:
            case 12:
            case 18:
            case 19:
            case 20:
            case 22:
            default:
                return null;
            case 2:
                return new BLX();
            case 4:
                return AnonymousClass001.A0i();
            case 5:
                return new C1326AhD(C8j3.A0U(1308617531L));
            case 7:
            case 8:
                return C8j3.A0l(0L);
            case 11:
                return new C1949Aun(1L);
            case 13:
                AKH<Boolean> akh = ARb.A01;
                return AnonymousClass001.A0i();
            case 14:
                BBL.A02("Unexpected call to default provider");
                throw F60.createAndThrow();
            case 15:
                throw C3cG.A0Q("CompositionLocal LocalHostDefaultProvider not present");
            case 16:
                return C1649AnS.A00;
            case 17:
                return new AG9(C3cG.A0j());
            case 21:
                AKH<C1HY> akh2 = AIC.A00;
                throw C3cG.A0Q("CompositionLocal LocalLifecycleOwner not present");
            case 34:
                AKH<A6I> akh3 = AIB.A00;
                throw C3cG.A0Q("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 35:
                C9iZ c9iZ = A1S.A03;
                return C3cG.A19(C07729ii.A00);
            case 36:
                F0C f0c = B9J.A00;
                return C60O.A02();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return C9iL.A02("com.whatsapp.accountlinking.ipc.api.models.ContextualUnpauseResult", ContextualUnpauseResult.values(), new String[]{"enabled", "not_enabled", "fallback"}, new Annotation[][]{null, null, null});
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                F0C<C9hr<Object>>[] f0cArr = CreateAcUserAndRecordDisclosureOperation.$childSerializers;
                return AnonymousClass001.A12(UseCase.A00);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                F0C<C9hr<Object>>[] f0cArr2 = CreateAcUserAndRecordDisclosureResultSuccess.$childSerializers;
                return C9iL.A00();
            case 40:
                F0C<C9hr<Object>>[] f0cArr3 = GetEncryptedProfileInfoOperation.$childSerializers;
                return AnonymousClass001.A12(UseCase.A00);
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                F0C<C9hr<Object>>[] f0cArr4 = GetEncryptedProfileInfoOperationResultSuccess.$childSerializers;
                return C9iL.A00();
            case 42:
                F0C<C9hr<Object>>[] f0cArr5 = GetFeatureEligibilityOperation.$childSerializers;
                return AnonymousClass001.A12(IpcFeature.A00);
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                F0C<C9hr<Object>>[] f0cArr6 = GetFeatureEligibilityResultSuccess.$childSerializers;
                return C9iL.A00();
            case 44:
                F0C<C9hr<Object>>[] f0cArr7 = GetFeatureEligibilityResultSuccess.$childSerializers;
                return AnonymousClass001.A12(ContextualUnpauseResult.A00);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                F0C<C9hr<Object>>[] f0cArr8 = GetRegisteredPhoneNumberOperationResultSuccess.$childSerializers;
                return C9iL.A00();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return C9iL.A02("com.whatsapp.accountlinking.ipc.api.models.IpcFeature", IpcFeature.values(), new String[]{"quick_sends", "ig_reel_to_status_crosspost", "ig_post_to_status_crosspost", "fb_story_to_status_crosspost", "fb_reel_to_status_crosspost", "fb_post_to_status_crosspost", "ig_story_to_status_crosspost", "ig_reel_to_status_inline_playback"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                F0C<C9hr<Object>> f0c2 = OperationResult.$cachedSerializer$delegate;
                return C9iL.A00();
            case 48:
                return OperationResult._init_$_anonymous_();
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                F0C<C9hr<Object>>[] f0cArr9 = OperationResultError.$childSerializers;
                return C9iL.A00();
        }
    }
}
