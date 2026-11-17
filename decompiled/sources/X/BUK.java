package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUK extends AbstractC07127nr implements G0V {
    public final int $t = 0;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/3UZ;LX/AOZ;LX/G0U<-LX/HtJ<-TR;>;+Ljava/lang/Object;>;LX/HtJ<-LX/BUK;>;)V */
    public BUK(C3UZ c3uz, AOZ aoz, HtJ htJ, G0U g0u) {
        super(2, htJ);
        this.A07 = c3uz;
        this.A05 = aoz;
        this.A06 = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        if (this.$t == 0) {
            BUK buk = new BUK((C3UZ) this.A07, (AOZ) this.A05, htJ, (G0U) this.A06);
            buk.A01 = obj;
            return buk;
        }
        BUK buk2 = new BUK((ContentResolver) this.A03, (Context) this.A07, (Uri) this.A06, (BQk) this.A02, htJ, (HzR) this.A01);
        buk2.A04 = obj;
        return buk2;
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0155: INVOKE (r8 I:X.BLa), (r4 I:java.lang.Object) INTERFACE call: X.BLa.Ahe(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:341), block:B:60:0x0155 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[Catch: all -> 0x0086, TryCatch #1 {all -> 0x0086, blocks: (B:15:0x0047, B:16:0x004a, B:18:0x0050, B:12:0x003a, B:11:0x0037, B:10:0x002e), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0044 -> B:16:0x004a). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BUK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BUK) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroid/content/ContentResolver;Landroid/net/Uri;LX/BQk;LX/HzR<Lkotlin/Unit;>;Landroid/content/Context;LX/HtJ<-LX/BUK;>;)V */
    public BUK(ContentResolver contentResolver, Context context, Uri uri, BQk bQk, HtJ htJ, HzR hzR) {
        super(2, htJ);
        this.A03 = contentResolver;
        this.A06 = uri;
        this.A02 = bQk;
        this.A01 = hzR;
        this.A07 = context;
    }
}
