package X;

import android.content.Context;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.credentials.PrepareGetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.concurrent.Executor;

/* renamed from: X.Csp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4301Csp implements InterfaceC4309Csx {
    public final CredentialManager A00;

    private final GetCredentialRequest A00(C4294Csh c4294Csh) {
        C7384Etj.A0Y(c4294Csh, 0);
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundleA0N.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", c4294Csh.A02);
        bundleA0N.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", c4294Csh.A00);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundleA0N);
        for (AbstractC4308Csw abstractC4308Csw : c4294Csh.A01) {
            builder.addCredentialOption(new CredentialOption.Builder(abstractC4308Csw.A02, abstractC4308Csw.A01, abstractC4308Csw.A00).setIsSystemProviderRequired(abstractC4308Csw.A04).setAllowedProviders(abstractC4308Csw.A03).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builder.build();
        C7384Etj.A0U(getCredentialRequestBuild);
        return getCredentialRequestBuild;
    }

    @Override // X.InterfaceC4309Csx
    public final void onGetCredential(Context context, C4294Csh c4294Csh, CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ<C4381Cug, GetCredentialException> interfaceC4370CuQ) {
        C7384Etj.A0Y(context, 0);
        CredentialManager credentialManager = this.A00;
        if (credentialManager == null) {
            interfaceC4370CuQ.AT2(new GetCredentialUnsupportedException("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION", "Your device doesn't support credential manager"));
        } else {
            credentialManager.getCredential(context, A00(c4294Csh), cancellationSignal, executor, new C4302Csq(interfaceC4370CuQ, this));
        }
    }

    @Override // X.InterfaceC4309Csx
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.A00 != null;
    }

    @Override // X.InterfaceC4309Csx
    public final void onPrepareCredential(C4294Csh c4294Csh, CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ<C4314CtC, GetCredentialException> interfaceC4370CuQ) {
        CredentialManager credentialManager = this.A00;
        if (credentialManager == null) {
            interfaceC4370CuQ.AT2(new GetCredentialUnsupportedException("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION", "Your device doesn't support credential manager"));
        } else {
            credentialManager.prepareGetCredential(A00(c4294Csh), cancellationSignal, executor, new C4303Csr(interfaceC4370CuQ, this));
        }
    }

    public C4301Csp(Context context) {
        this.A00 = (CredentialManager) context.getSystemService(HatchCcvLoggingKt.STEP_UP_SOURCE_CREDENTIAL);
    }

    public static final C4381Cug A01(GetCredentialResponse getCredentialResponse) {
        Credential credential = getCredentialResponse.getCredential();
        C7384Etj.A0U(credential);
        String type = credential.getType();
        C7384Etj.A0U(type);
        Bundle data = credential.getData();
        C7384Etj.A0U(data);
        return new C4381Cug(AbstractC4300Cso.A01(data, type));
    }

    public static final C4314CtC A02(PrepareGetCredentialResponse prepareGetCredentialResponse) {
        C4349Ctr c4349Ctr = new C4349Ctr(prepareGetCredentialResponse.getPendingGetCredentialHandle());
        Ct9 ct9 = new Ct9();
        ct9.A03(prepareGetCredentialResponse);
        ct9.A01 = c4349Ctr;
        return new C4314CtC(c4349Ctr, ct9.A03, ct9.A02, ct9.A04);
    }

    public static final GetCredentialException A03(android.credentials.GetCredentialException getCredentialException) {
        String type = getCredentialException.getType();
        C7384Etj.A0U(type);
        return AbstractC4410CvW.A00(getCredentialException.getMessage(), type);
    }
}
