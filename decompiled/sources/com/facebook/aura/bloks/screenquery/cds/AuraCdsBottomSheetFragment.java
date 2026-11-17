package com.facebook.aura.bloks.screenquery.cds;

import X.C06H;
import X.C7384Etj;
import X.FBD;
import X.FOS;
import X.FOY;
import X.InterfaceC8010FPf;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment;
import com.facebook.aura.bloks.host.AuraBloksConfig;
import com.facebook.aura.bloks.host.AuraBloksHost;

/* loaded from: classes6.dex */
public final class AuraCdsBottomSheetFragment extends AuraRealityLabsCdsBottomSheetFragment {
    public static final Companion Companion = new Companion();
    public final int hostId = -1;

    public final class Companion {
        public final AuraCdsBottomSheetFragment newInstance(String str, FOY foy) {
            C7384Etj.A0Y(foy, 1);
            AuraCdsBottomSheetFragment auraCdsBottomSheetFragment = new AuraCdsBottomSheetFragment();
            auraCdsBottomSheetFragment.init(str, foy);
            return auraCdsBottomSheetFragment;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    @Override // com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment
    public int getHostId() {
        return this.hostId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissFullScreen() {
        if (getParentFragmentManager().A0R() > 1 && !getParentFragmentManager().A0F) {
            getParentFragmentManager().A0d();
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment
    public FBD getBloksHost() {
        return new AuraBloksHost(getParentFragmentManager(), getActivity(), new AuraBloksConfig());
    }

    public final void onBackPress() {
        FOS bottomSheetDelegate = getBottomSheetDelegate();
        Context contextRequireContext = requireContext();
        C7384Etj.A0U(contextRequireContext);
        bottomSheetDelegate.A0B(contextRequireContext);
    }

    @Override // com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FOS bottomSheetDelegate = getBottomSheetDelegate();
        Context contextRequireContext = requireContext();
        C7384Etj.A0U(contextRequireContext);
        return bottomSheetDelegate.A0A(contextRequireContext, new InterfaceC8010FPf() { // from class: com.facebook.aura.bloks.screenquery.cds.AuraCdsBottomSheetFragment.onCreateView.1
            @Override // X.InterfaceC8010FPf
            public final void onDismissFullScreen() {
                AuraCdsBottomSheetFragment.this.dismissFullScreen();
            }
        });
    }
}
