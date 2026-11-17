package X;

import android.net.Uri;
import java.io.IOException;
import java.util.function.BooleanSupplier;

/* renamed from: X.DhQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5374DhQ implements InterfaceC5369DhL {
    public final /* synthetic */ DmR A00;
    public final /* synthetic */ C5615Dlu A01;
    public final /* synthetic */ BooleanSupplier A02;

    @Override // X.Du7
    public final /* synthetic */ void onLoadCanceled(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra) {
    }

    @Override // X.Du7
    public final /* synthetic */ void onLoadCompleted(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra) {
    }

    public C5374DhQ(DmR dmR, C5615Dlu c5615Dlu, BooleanSupplier booleanSupplier) {
        this.A02 = booleanSupplier;
        this.A00 = dmR;
        this.A01 = c5615Dlu;
    }

    @Override // X.InterfaceC5369DhL
    public final /* synthetic */ void onLiveTraceEventMessage(Uri uri, String str) {
    }

    @Override // X.Du7
    public final /* synthetic */ void onDownstreamFormatChanged(int i, Dy6 dy6, C5893Dra c5893Dra) {
    }

    @Override // X.InterfaceC5369DhL
    public final /* synthetic */ void onErrorRecoveryAttempt(IOException iOException, String str, String str2) {
    }

    @Override // X.InterfaceC5369DhL
    public final /* synthetic */ void onImfEventEmsgReceived(byte[] bArr, String str, long j) {
    }

    @Override // X.InterfaceC5369DhL
    public final /* synthetic */ void onManifestLoadCompleted(C5893Dra c5893Dra, Object obj, Object obj2) {
    }

    @Override // X.Du7
    public final /* synthetic */ void onUpstreamDiscarded(int i, Dy6 dy6, C5893Dra c5893Dra) {
    }

    @Override // X.Du7
    public final /* synthetic */ void onLoadError(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra, IOException iOException, boolean z) {
    }

    @Override // X.Du7
    public final /* synthetic */ void onLoadStarted(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra, int i2) {
    }

    @Override // X.InterfaceC5369DhL
    public final /* synthetic */ void onTrackSelectionFallback(C6154Dwx c6154Dwx, C6154Dwx c6154Dwx2, String str, String str2, IOException iOException) {
    }
}
