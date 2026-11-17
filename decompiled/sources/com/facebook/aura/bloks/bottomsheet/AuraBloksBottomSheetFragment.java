package com.facebook.aura.bloks.bottomsheet;

import X.AbstractC7559F3s;
import X.AbstractC8571FgQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B1U;
import X.BBI;
import X.BDa;
import X.BFM;
import X.C06H;
import X.C7384Etj;
import X.C78N;
import X.DialogC8130FVg;
import X.G0V;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.vds.compose.ext.ViewExtKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraBloksBottomSheetFragment extends BottomSheetDialogFragment {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public AuraBloksBottomSheetData bloksBottomSheetData;

    /* renamed from: com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetFragment$onCreateView$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public AnonymousClass1() {
            super(2);
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean zA67 = bfm.A67(AuraBloksBottomSheetFragment.this);
            AuraBloksBottomSheetFragment auraBloksBottomSheetFragment = AuraBloksBottomSheetFragment.this;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new AuraBloksBottomSheetFragment$onCreateView$1$1$1(auraBloksBottomSheetFragment);
                BBI.A0T(bfm, objAaT);
            }
            AuraBloksBottomSheetContentKt.AuraBloksBottomSheetContent((Function0) objAaT, null, bfm, 0, 2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC8571FgQ supportFragmentManager;
        AuraBloksBottomSheetData auraBloksBottomSheetData = this.bloksBottomSheetData;
        if (auraBloksBottomSheetData != null) {
            AuraBloksBottomSheetStateHolder.instance.setBottomSheetData(auraBloksBottomSheetData);
            Context contextRequireContext = requireContext();
            C7384Etj.A0U(contextRequireContext);
            return ViewExtKt.auraComposeView(contextRequireContext, AuraThemeMode.DEFAULT, BDa.A00, null, B1U.A02(new AnonymousClass1(), 83897996));
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.A0d();
        }
        return new View(requireContext());
    }

    public final class Companion {
        public final AuraBloksBottomSheetFragment newInstance(AuraBloksBottomSheetData auraBloksBottomSheetData) {
            C7384Etj.A0Y(auraBloksBottomSheetData, 0);
            AuraBloksBottomSheetFragment auraBloksBottomSheetFragment = new AuraBloksBottomSheetFragment();
            auraBloksBottomSheetFragment.bloksBottomSheetData = auraBloksBottomSheetData;
            return auraBloksBottomSheetFragment;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) throws Resources.NotFoundException {
        DialogC8130FVg dialogC8130FVg = (DialogC8130FVg) super.onCreateDialog(bundle);
        if (dialogC8130FVg.A03 == null) {
            DialogC8130FVg.A01(dialogC8130FVg);
        }
        dialogC8130FVg.A03.A09(3);
        return dialogC8130FVg;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        AuraBloksBottomSheetContentInterface auraBloksBottomSheetContentInterface;
        super.onDestroy();
        AuraBloksBottomSheetData auraBloksBottomSheetData = this.bloksBottomSheetData;
        if (auraBloksBottomSheetData != null && (auraBloksBottomSheetContentInterface = auraBloksBottomSheetData.content) != null) {
            auraBloksBottomSheetContentInterface.onDestroy();
        }
        AuraBloksBottomSheetStateHolder.instance.clearBottomSheetData();
        this.bloksBottomSheetData = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Function0<Unit> function0;
        AuraBloksBottomSheetContentInterface auraBloksBottomSheetContentInterface;
        super.onDestroyView();
        AuraBloksBottomSheetData auraBloksBottomSheetData = this.bloksBottomSheetData;
        if (auraBloksBottomSheetData != null && (auraBloksBottomSheetContentInterface = auraBloksBottomSheetData.content) != null) {
            auraBloksBottomSheetContentInterface.onDestroyView();
        }
        AuraBloksBottomSheetData auraBloksBottomSheetData2 = this.bloksBottomSheetData;
        if (auraBloksBottomSheetData2 == null || (function0 = auraBloksBottomSheetData2.onDismiss) == null) {
            return;
        }
        function0.invoke();
    }
}
