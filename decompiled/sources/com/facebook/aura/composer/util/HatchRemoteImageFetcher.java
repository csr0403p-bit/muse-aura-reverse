package com.facebook.aura.composer.util;

import X.AbstractC7206EiO;
import X.AbstractC7209EiU;
import X.BV4;
import X.BV7;
import X.C60O;
import X.C60Q;
import X.C6986Edm;
import X.C7109EgN;
import X.C7154EhP;
import X.C7182Ehs;
import X.C7183Eht;
import X.C7184Ehu;
import X.C7207EiP;
import X.C7267Ejs;
import X.C7384Etj;
import X.C7Bm;
import X.CFK;
import X.CVn;
import X.EfF;
import X.EnumC7058Ef5;
import X.F0C;
import X.FGI;
import X.GBL;
import X.HtJ;
import X.HzP;
import X.InterfaceC7015EeM;
import X.InterfaceC7236Ej0;
import android.net.Uri;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class HatchRemoteImageFetcher {
    public static final String CALLER_CONTEXT = "HatchRemoteAttachment";
    public static final HatchRemoteImageFetcher INSTANCE = new HatchRemoteImageFetcher();
    public static final String TAG = "HatchRemoteImageFetcher";

    @DebugMetadata(c = "com.facebook.aura.composer.util.HatchRemoteImageFetcher", f = "HatchRemoteImageFetcher.kt", l = {36, 42}, m = "fetchCompressed", v = 2)
    /* renamed from: com.facebook.aura.composer.util.HatchRemoteImageFetcher$fetchCompressed$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public long J$0;
        public long J$1;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchRemoteImageFetcher.this.fetchCompressed(null, 0L, 0L, this);
        }
    }

    public final boolean isRemote(Uri uri) {
        String scheme;
        C7384Etj.A0Y(uri, 0);
        String scheme2 = uri.getScheme();
        return (scheme2 != null && scheme2.equalsIgnoreCase("https")) || ((scheme = uri.getScheme()) != null && scheme.equalsIgnoreCase(AuraDeeplinkHandlerActivity.HTTP));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchCompressed(android.net.Uri r12, long r13, long r15, X.HtJ<? super byte[]> r17) throws java.lang.NumberFormatException {
        /*
            r11 = this;
            r3 = r17
            r6 = r12
            boolean r0 = r3 instanceof com.facebook.aura.composer.util.HatchRemoteImageFetcher.AnonymousClass1
            if (r0 == 0) goto L89
            r10 = r3
            com.facebook.aura.composer.util.HatchRemoteImageFetcher$fetchCompressed$1 r10 = (com.facebook.aura.composer.util.HatchRemoteImageFetcher.AnonymousClass1) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L89
            int r2 = r2 - r1
            r10.label = r2
        L15:
            java.lang.Object r2 = r10.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r10.label
            r4 = 2
            r0 = 1
            r9 = 0
            if (r1 == 0) goto L36
            if (r1 == r0) goto L48
            if (r1 != r4) goto L8f
            long r13 = r10.J$0
            X.Hwg.A00(r2)
        L29:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L94
            com.facebook.aura.composer.util.ImageCompressor r1 = com.facebook.aura.composer.util.ImageCompressor.INSTANCE
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = r1.compressToTarget(r2, r13, r0)
            return r0
        L36:
            X.Hwg.A00(r2)
            r10.L$0 = r12
            r10.J$0 = r13
            r10.J$1 = r15
            r10.label = r0
            java.lang.Object r2 = r11.fetchEncodedSize(r12, r10)
            if (r2 != r3) goto L53
            return r3
        L48:
            long r15 = r10.J$1
            long r13 = r10.J$0
            java.lang.Object r6 = r10.L$0
            android.net.Uri r6 = (android.net.Uri) r6
            X.Hwg.A00(r2)
        L53:
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L94
            int r2 = r2.intValue()
            long r0 = (long) r2
            int r5 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r5 <= 0) goto L6e
            java.lang.String r1 = "Remote image over cap: "
            java.lang.String r0 = " bytes"
            java.lang.String r1 = X.FGI.A0I(r1, r2, r0)
            java.lang.String r0 = "HatchRemoteImageFetcher"
            X.CFK.A06(r0, r1)
            return r9
        L6e:
            com.facebook.aura.common.image.AuraBitmapLoader r5 = com.facebook.aura.common.image.AuraBitmapLoader.INSTANCE
            r0 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r8 = X.C3cG.A0R(r0)
            r10.L$0 = r9
            r10.J$0 = r13
            r10.J$1 = r15
            r10.I$0 = r2
            r10.label = r4
            java.lang.String r7 = "HatchRemoteAttachment"
            java.lang.Object r2 = r5.load(r6, r7, r8, r9, r10)
            if (r2 != r3) goto L29
            return r3
        L89:
            com.facebook.aura.composer.util.HatchRemoteImageFetcher$fetchCompressed$1 r10 = new com.facebook.aura.composer.util.HatchRemoteImageFetcher$fetchCompressed$1
            r10.<init>(r3)
            goto L15
        L8f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L94:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.util.HatchRemoteImageFetcher.fetchCompressed(android.net.Uri, long, long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchEncodedSize(Uri uri, HtJ<? super Integer> htJ) throws NumberFormatException {
        AbstractC7206EiO c7207EiP;
        F0C f0c;
        final GBL gblA03 = C7Bm.A03(htJ);
        C7182Ehs c7182EhsA06 = C7109EgN.A03().A06();
        C7184Ehu c7184Ehu = new C7184Ehu();
        uri.getClass();
        c7184Ehu.A02 = uri;
        C7183Eht c7183EhtA01 = c7184Ehu.A01();
        Uri uri2 = c7183EhtA01.A04;
        if (uri2 == null) {
            throw BV4.A0U();
        }
        try {
            C7154EhP c7154EhP = c7182EhsA06.A07;
            C7267Ejs.A00();
            CVn.A02(BV7.A1S(c7183EhtA01.A0D.mValue, EnumC7058Ef5.ENCODED_MEMORY_CACHE.mValue));
            int i = c7183EhtA01.A03;
            if (i == 0) {
                f0c = c7154EhP.A0O;
            } else if (i == 2 || i == 3) {
                f0c = c7154EhP.A0I;
            } else {
                if (i != 4) {
                    Set set = c7154EhP.A09;
                    if (set != null) {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw BV4.A0a("getCustomEncodedImageSequence");
                        }
                    }
                    String strA0o = C60O.A0o(uri2);
                    if (strA0o.length() > 30) {
                        strA0o = FGI.A0M(BV4.A0j(strA0o, 30), "...");
                    }
                    throw C60Q.A0U("Unsupported uri scheme for encoded image fetch! Uri is: ", strA0o);
                }
                f0c = c7154EhP.A0G;
            }
            InterfaceC7015EeM interfaceC7015EeM = (InterfaceC7015EeM) f0c.getValue();
            if (c7183EhtA01.A08 != null) {
                C7184Ehu c7184EhuA00 = C7184Ehu.A00(c7183EhtA01);
                c7184EhuA00.A06 = null;
                c7183EhtA01 = c7184EhuA00.A01();
            }
            c7207EiP = C7182Ehs.A01(c7182EhsA06, null, interfaceC7015EeM, EnumC7058Ef5.FULL_FETCH, c7183EhtA01, CALLER_CONTEXT, null);
        } catch (Exception e) {
            c7207EiP = new C7207EiP();
            c7207EiP.A07(e, null);
        }
        c7207EiP.Agc(new AbstractC7209EiU() { // from class: com.facebook.aura.composer.util.HatchRemoteImageFetcher$fetchEncodedSize$2$1
            @Override // X.AbstractC7209EiU
            public void onFailureImpl(InterfaceC7236Ej0 interfaceC7236Ej0) {
                C7384Etj.A0Y(interfaceC7236Ej0, 0);
                if (gblA03.isActive()) {
                    Throwable thAFW = interfaceC7236Ej0.AFW();
                    CFK.A06(HatchRemoteImageFetcher.TAG, FGI.A0M("Remote image fetch failed: ", thAFW != null ? thAFW.getMessage() : null));
                    gblA03.resumeWith(null);
                }
            }

            @Override // X.AbstractC7209EiU
            public void onNewResultImpl(InterfaceC7236Ej0 interfaceC7236Ej0) {
                C6986Edm c6986Edm;
                C7384Etj.A0Y(interfaceC7236Ej0, 0);
                if (interfaceC7236Ej0.AOQ() && gblA03.isActive()) {
                    EfF efF = (EfF) interfaceC7236Ej0.AJm();
                    try {
                        gblA03.resumeWith((efF == null || (c6986Edm = (C6986Edm) efF.A04()) == null) ? null : Integer.valueOf(c6986Edm.A03()));
                    } finally {
                        if (efF != null) {
                            efF.close();
                        }
                    }
                }
            }
        }, F0C.A05());
        gblA03.AO2(new HatchRemoteImageFetcher$fetchEncodedSize$2$2(c7207EiP));
        return gblA03.A0F();
    }
}
