package X;

import com.facebook.aura.audio.AudioStatus;
import com.facebook.aura.audio.HatchAudioPlaybackState;
import com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8$1$1$1$4;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.email.viewmodel.EmailState;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1BO, reason: invalid class name */
/* loaded from: classes.dex */
public interface C1BO<T> {
    T getValue();

    static HatchConversationUiState A05(HatchConversationContentKt$HatchConversationContent$8$1$1$1$4 hatchConversationContentKt$HatchConversationContent$8$1$1$1$4) {
        return hatchConversationContentKt$HatchConversationContent$8$1$1$1$4.$uiState$delegate.getValue();
    }

    static float A00(C1BO c1bo) {
        return ((C1DG) c1bo.getValue()).A00;
    }

    static float A01(C1BO c1bo) {
        return ((Number) c1bo.getValue()).floatValue();
    }

    static int A02(C1BO c1bo) {
        return ((Number) c1bo.getValue()).intValue();
    }

    static long A03(C1BO c1bo) {
        return ((B6A) c1bo.getValue()).A00;
    }

    static AudioStatus A04(C1BO c1bo) {
        HatchAudioPlaybackState hatchAudioPlaybackState = (HatchAudioPlaybackState) c1bo.getValue();
        if (hatchAudioPlaybackState != null) {
            return hatchAudioPlaybackState.status;
        }
        return null;
    }

    static EmailState A06(C1BO c1bo) {
        return (EmailState) c1bo.getValue();
    }

    static Object A07(BFM bfm, C1BN c1bn) {
        return C2CK.A02(bfm, c1bn).getValue();
    }

    static String A08(C1BO c1bo) {
        return (String) c1bo.getValue();
    }

    static Iterator A09(C1BO c1bo) {
        return ((List) c1bo.getValue()).iterator();
    }

    static Function0 A0A(C1BO c1bo) {
        return (Function0) c1bo.getValue();
    }

    static G0U A0B(C1BO c1bo) {
        return (G0U) c1bo.getValue();
    }

    static AHD A0C(C1BO c1bo) {
        return (AHD) c1bo.getValue();
    }

    static void A0D(C1BO c1bo) {
        ((Function0) c1bo.getValue()).invoke();
    }

    static boolean A0E(C1BO c1bo) {
        return ((List) c1bo.getValue()).isEmpty();
    }

    static boolean A0F(C1BO c1bo) {
        return ((Boolean) c1bo.getValue()).booleanValue();
    }
}
