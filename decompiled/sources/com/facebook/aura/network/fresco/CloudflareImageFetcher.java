package com.facebook.aura.network.fresco;

import X.C27i;
import X.C7384Etj;
import X.C8eM;
import X.GCQ;
import X.HtJ;
import X.HzP;
import com.facebook.aura.network.AuraAuthHeaders;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class CloudflareImageFetcher {
    public static final CloudflareImageFetcher INSTANCE = new CloudflareImageFetcher();
    public static final String TAG = "CloudflareImageFetcher";
    public static final C8eM permits;

    @DebugMetadata(c = "com.facebook.aura.network.fresco.CloudflareImageFetcher", f = "CloudflareImageFetcher.kt", l = {210, 72, 124}, m = "fetch", v = 2)
    /* renamed from: com.facebook.aura.network.fresco.CloudflareImageFetcher$fetch$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudflareImageFetcher.this.fetch(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.fresco.CloudflareImageFetcher", f = "CloudflareImageFetcher.kt", l = {187}, m = "mintToken", v = 2)
    /* renamed from: com.facebook.aura.network.fresco.CloudflareImageFetcher$mintToken$1, reason: invalid class name and case insensitive filesystem */
    public final class C127151 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C127151(HtJ<? super C127151> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudflareImageFetcher.this.mintToken(null, null, null, this);
        }
    }

    static {
        int i = GCQ.A00;
        permits = new C27i(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mintToken(com.facebook.aura.network.api.CloudflareImageUrl r26, java.lang.String r27, java.lang.String r28, X.HtJ<? super java.lang.String> r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.fresco.CloudflareImageFetcher.mintToken(com.facebook.aura.network.api.CloudflareImageUrl, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    private final void requireCurrentAccount(String str) {
        if (!C7384Etj.areEqual(AuraAuthHeaders.INSTANCE.currentUserIdForCache(), str)) {
            throw new CancellationException("Cloudflare image account changed");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e1, code lost:
    
        if (r8.A2u(r2) == r27) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0347: INVOKE (r2 I:long) = (r16 I:long) STATIC call: X.3cG.A04(long):long A[Catch: all -> 0x0360, MD:(long):long (m)] (LINE:839), block:B:91:0x033f */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0112 A[Catch: Exception -> 0x0332, CancellationException -> 0x0334, all -> 0x0360, TRY_ENTER, TryCatch #3 {CancellationException -> 0x0334, blocks: (B:70:0x02d3, B:71:0x02d6, B:72:0x02e9, B:24:0x0112, B:28:0x01b3, B:74:0x02f5, B:57:0x0272, B:60:0x0279, B:62:0x027d, B:65:0x0295, B:67:0x0299, B:85:0x0324, B:86:0x0331, B:83:0x0318, B:84:0x031c, B:27:0x01b0), top: B:96:0x002b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01cf A[Catch: all -> 0x0315, TryCatch #1 {all -> 0x0315, blocks: (B:29:0x01b5, B:32:0x01c4, B:46:0x020e, B:48:0x022d, B:50:0x0233, B:52:0x0237, B:54:0x0258, B:77:0x02fc, B:78:0x0313, B:55:0x026e, B:33:0x01cf, B:36:0x01da, B:39:0x01f6, B:41:0x01fc), top: B:97:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0272 A[Catch: Exception -> 0x0332, CancellationException -> 0x0334, all -> 0x0360, TRY_ENTER, TryCatch #3 {CancellationException -> 0x0334, blocks: (B:70:0x02d3, B:71:0x02d6, B:72:0x02e9, B:24:0x0112, B:28:0x01b3, B:74:0x02f5, B:57:0x0272, B:60:0x0279, B:62:0x027d, B:65:0x0295, B:67:0x0299, B:85:0x0324, B:86:0x0331, B:83:0x0318, B:84:0x031c, B:27:0x01b0), top: B:96:0x002b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x031c A[Catch: Exception -> 0x0332, CancellationException -> 0x0334, all -> 0x0360, TryCatch #3 {CancellationException -> 0x0334, blocks: (B:70:0x02d3, B:71:0x02d6, B:72:0x02e9, B:24:0x0112, B:28:0x01b3, B:74:0x02f5, B:57:0x0272, B:60:0x0279, B:62:0x027d, B:65:0x0295, B:67:0x0299, B:85:0x0324, B:86:0x0331, B:83:0x0318, B:84:0x031c, B:27:0x01b0), top: B:96:0x002b, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r5v37, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r5v63, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.8eM, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x027d -> B:72:0x02e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x02d0 -> B:71:0x02d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetch(com.facebook.aura.network.api.CloudflareImageUrl r42, java.lang.String r43, com.facebook.aura.network.transport.HatchRequestPurpose r44, java.lang.String r45, X.HtJ<? super byte[]> r46) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.fresco.CloudflareImageFetcher.fetch(com.facebook.aura.network.api.CloudflareImageUrl, java.lang.String, com.facebook.aura.network.transport.HatchRequestPurpose, java.lang.String, X.HtJ):java.lang.Object");
    }
}
