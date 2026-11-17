package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BV4;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.localbrowser.LocalBrowserTransferFiles;
import com.hatch.browser.core.NativeException;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserFileSource$stage$staged$1$read$2", f = "LocalBrowserFileSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class LocalBrowserFileSource$stage$staged$1$read$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
    public final /* synthetic */ LocalBrowserTransferFiles.Lease $lease;
    public final /* synthetic */ int $length;
    public final /* synthetic */ long $offset;
    public int label;
    public final /* synthetic */ LocalBrowserFileSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserFileSource$stage$staged$1$read$2(LocalBrowserFileSource localBrowserFileSource, LocalBrowserTransferFiles.Lease lease, long j, int i, HtJ<? super LocalBrowserFileSource$stage$staged$1$read$2> htJ) {
        super(2, htJ);
        this.this$0 = localBrowserFileSource;
        this.$lease = lease;
        this.$offset = j;
        this.$length = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserFileSource$stage$staged$1$read$2(this.this$0, this.$lease, this.$offset, this.$length, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws NativeException.Unauthorized, NativeException.Unavailable, IOException {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.this$0.checkCurrent();
        this.$lease.checkLive();
        RandomAccessFile randomAccessFileA0L = BV4.A0L(this.$lease.file);
        long j = this.$offset;
        int i = this.$length;
        try {
            randomAccessFileA0L.seek(j);
            byte[] bArr = new byte[i];
            randomAccessFileA0L.readFully(bArr);
            randomAccessFileA0L.close();
            return bArr;
        } finally {
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
        return ((LocalBrowserFileSource$stage$staged$1$read$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
