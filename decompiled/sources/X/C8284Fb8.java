package X;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;

/* renamed from: X.Fb8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8284Fb8 implements InterfaceC8623FhT {
    public final /* synthetic */ AppCompatActivity A00;

    public C8284Fb8(AppCompatActivity appCompatActivity) {
        this.A00 = appCompatActivity;
    }

    @Override // X.InterfaceC8623FhT
    public final void ASR(Context context) {
        AppCompatActivity appCompatActivity = this.A00;
        EC9 delegate = appCompatActivity.getDelegate();
        delegate.A0J();
        appCompatActivity.savedStateRegistryController.A00.A00(AppCompatActivity.DELEGATE_TAG);
        delegate.A0L();
    }
}
