package androidx.compose.runtime;

import X.AT5;
import X.B6A;
import X.BBI;
import X.BFM;
import X.C1805ArO;
import X.C1BO;
import X.C1er;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1;

/* loaded from: classes.dex */
public interface MutableState<T> extends C1BO<T> {
    static long A03(BFM bfm, BBI bbi, long j) {
        MutableState mutableStateA00 = C1er.A00(bfm, new B6A(j));
        BBI.A0R(bbi, false);
        return ((B6A) mutableStateA00.getValue()).A00;
    }

    void Af8(T t);

    @Override // X.C1BO
    T getValue();

    static float A00(AT5 at5) {
        return ((Number) at5.A04.A05.getValue()).floatValue();
    }

    static int A01(MutableState mutableState) {
        return ((String) mutableState.getValue()).length();
    }

    static int A02(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    static String A04(MutableState mutableState) {
        return ((C1805ArO) mutableState.getValue()).A01.A00;
    }

    static String A05(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    static String A06(MutableState mutableState) {
        return C7BY.A0F((String) mutableState.getValue()).toString();
    }

    static void A07(int i, MutableState mutableState) {
        mutableState.Af8(Integer.valueOf(i));
    }

    static void A08(MutableState mutableState, HatchConversationKt$HatchConversation$17$1 hatchConversationKt$HatchConversation$17$1, boolean z) {
        A09(z, mutableState);
        hatchConversationKt$HatchConversation$17$1.$previousResponseContentSignature$delegate.Af8(hatchConversationKt$HatchConversation$17$1.$latestResponseContentSignature);
        hatchConversationKt$HatchConversation$17$1.$previousResponseContentIds$delegate.Af8(hatchConversationKt$HatchConversation$17$1.$latestResponseContentIds);
    }

    static void A09(boolean z, MutableState mutableState) {
        mutableState.Af8(Boolean.valueOf(z));
    }

    static boolean A0A(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    static boolean A0B(MutableState mutableState, Object obj) {
        return C7384Etj.areEqual(obj, mutableState.getValue());
    }
}
