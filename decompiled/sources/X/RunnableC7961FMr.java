package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment;
import com.instagram.common.bloks.BloksParseResult;

/* renamed from: X.FMr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC7961FMr implements Runnable {
    public static final String __redex_internal_original_name = "CDSBloksBottomSheetController$openFullScreen$1";

    /* JADX INFO: Incorrect field signature: TTBottomSheetFragment; */
    public final /* synthetic */ DialogFragment A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ FOI A02;
    public final /* synthetic */ BloksParseResult A03;
    public final /* synthetic */ HsN A04;
    public final /* synthetic */ C7958FMo A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: Incorrect types in method signature: (TTBottomSheetFragment;Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;LX/FOI;LX/HsN;Lcom/instagram/common/bloks/BloksParseResult;LX/FMo;)V */
    public RunnableC7961FMr(DialogFragment dialogFragment, FragmentActivity fragmentActivity, FOI foi, BloksParseResult bloksParseResult, HsN hsN, C7958FMo c7958FMo, String str) {
        this.A00 = dialogFragment;
        this.A01 = fragmentActivity;
        this.A06 = str;
        this.A02 = foi;
        this.A04 = hsN;
        this.A03 = bloksParseResult;
        this.A05 = c7958FMo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AuraRealityLabsCdsBottomSheetFragment auraRealityLabsCdsBottomSheetFragment = (AuraRealityLabsCdsBottomSheetFragment) this.A00;
        FOA foaA01 = AbstractC7965FMw.A01(auraRealityLabsCdsBottomSheetFragment.getDelegateCdsBottomSheet());
        FragmentActivity fragmentActivity = this.A01;
        String str = this.A06;
        FOI foi = this.A02;
        InterfaceC7992FOj interfaceC7992FOjA02 = AbstractC7965FMw.A02(fragmentActivity, foaA01, foi, this.A03, this.A04, str);
        C7967FMy delegateCdsBottomSheet = auraRealityLabsCdsBottomSheetFragment.getDelegateCdsBottomSheet();
        C7958FMo c7958FMo = this.A05;
        C7932FLe c7932FLeA00 = AbstractC7965FMw.A00(foi);
        C7944FLz c7944FLz = new C7944FLz(null);
        EnumC7946FMb enumC7946FMb = c7958FMo.A01;
        FOO foo = c7958FMo.A00;
        C7967FMy.A01(delegateCdsBottomSheet, new C7964FMu(foo != null ? new C7963FMt(null, foo) : null, null, null, null, null, null, new C7942FLo(enumC7946FMb)).A00(c7932FLeA00), interfaceC7992FOjA02, c7944FLz);
    }
}
