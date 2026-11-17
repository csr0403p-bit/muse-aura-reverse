package X;

import android.os.Handler;
import android.widget.SeekBar;

/* renamed from: X.FFk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7804FFk implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C7918FKq A00;
    public final /* synthetic */ FBB A01;
    public final /* synthetic */ FDW A02;
    public final /* synthetic */ HsM A03;
    public final /* synthetic */ HsM A04;

    public C7804FFk(C7918FKq c7918FKq, FBB fbb, FDW fdw, HsM hsM, HsM hsM2) {
        this.A00 = c7918FKq;
        this.A04 = hsM;
        this.A02 = fdw;
        this.A01 = fbb;
        this.A03 = hsM2;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Handler handler = C7919FKr.A00;
        C7918FKq c7918FKq = this.A00;
        handler.removeMessages(0, c7918FKq);
        c7918FKq.A08 = i;
        handler.sendMessage(handler.obtainMessage(0, c7918FKq));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        HsM hsM = this.A04;
        if (hsM != null) {
            F9J.A03(this.A01, this.A02, C9115Fyg.A00(), hsM, 0);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        HsM hsM = this.A03;
        if (hsM != null) {
            F9J.A03(this.A01, this.A02, C9115Fyg.A00(), hsM, 0);
        }
    }
}
