package com.facebook.aura.localbrowser.core;

import X.AbstractC07127nr;
import X.AbstractC2159Azp;
import X.C06H;
import X.C3UX;
import X.C7384Etj;
import X.C9258GBl;
import X.C9sU;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.InterfaceC2261BLa;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.json.HatchJsonKt;
import com.hatch.browser.core.Hatch_browser_core_uniffiKt;
import com.hatch.browser.core.PageClosure;
import com.hatch.browser.protocol.PageCloseOutcome;
import com.hatch.browser.protocol.PageCloseReceipt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes6.dex */
public final class BrowserEngineClosure {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String TAG = "BrowserEngineClosure";
    public final PageClosure closure;
    public PageCloseReceipt completed;
    public final InterfaceC2261BLa lock;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngineClosure$inspect$2", f = "BrowserEngineClosure.kt", l = {104, 35}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngineClosure$inspect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super BrowserEngineCloseReceipt>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserEngineClosure.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super BrowserEngineCloseReceipt> htJ) {
            return BrowserEngineClosure.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|37|(1:(1:(7:6|35|18|19|22|28|29)(2:7|8))(1:9))(2:10|(1:12))|39|13|(3:15|(1:17)|19)|22|28|29|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        
            r1 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        
            r2.Ahe(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            throw r0;
         */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r1 = r7.label
                r5 = 2
                r0 = 1
                java.lang.String r4 = "BrowserEngineClosure"
                r3 = 0
                if (r1 == 0) goto L29
                if (r1 == r0) goto L1d
                if (r1 != r5) goto L18
                java.lang.Object r1 = r7.L$1
                com.facebook.aura.localbrowser.core.BrowserEngineClosure r1 = (com.facebook.aura.localbrowser.core.BrowserEngineClosure) r1
                java.lang.Object r2 = r7.L$0
                X.BLa r2 = (X.InterfaceC2261BLa) r2
                goto L50
            L18:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L1d:
                java.lang.Object r1 = r7.L$1
                com.facebook.aura.localbrowser.core.BrowserEngineClosure r1 = (com.facebook.aura.localbrowser.core.BrowserEngineClosure) r1
                java.lang.Object r2 = r7.L$0
                X.BLa r2 = (X.InterfaceC2261BLa) r2
                X.Hwg.A00(r8)
                goto L3d
            L29:
                X.Hwg.A00(r8)
                com.facebook.aura.localbrowser.core.BrowserEngineClosure r1 = com.facebook.aura.localbrowser.core.BrowserEngineClosure.this
                X.BLa r2 = r1.lock
                r7.L$0 = r2
                r7.L$1 = r1
                r7.label = r0
                java.lang.Object r0 = r2.APs(r3, r7)
                if (r0 != r6) goto L3d
                return r6
            L3d:
                com.hatch.browser.protocol.PageCloseReceipt r8 = r1.completed     // Catch: java.nio.charset.CharacterCodingException -> L5d kotlinx.serialization.SerializationException -> L63 com.hatch.browser.protocol.ApiException -> L69 java.lang.Throwable -> L76
                if (r8 != 0) goto L58
                com.hatch.browser.core.PageClosure r0 = r1.closure     // Catch: java.nio.charset.CharacterCodingException -> L5d kotlinx.serialization.SerializationException -> L63 com.hatch.browser.protocol.ApiException -> L69 java.lang.Throwable -> L76
                r7.L$0 = r2     // Catch: java.nio.charset.CharacterCodingException -> L5d kotlinx.serialization.SerializationException -> L63 com.hatch.browser.protocol.ApiException -> L69 java.lang.Throwable -> L76
                r7.L$1 = r1     // Catch: java.nio.charset.CharacterCodingException -> L5d kotlinx.serialization.SerializationException -> L63 com.hatch.browser.protocol.ApiException -> L69 java.lang.Throwable -> L76
                r7.label = r5     // Catch: java.nio.charset.CharacterCodingException -> L5d kotlinx.serialization.SerializationException -> L63 com.hatch.browser.protocol.ApiException -> L69 java.lang.Throwable -> L76
                java.lang.Object r8 = r0.inspect(r7)     // Catch: java.nio.charset.CharacterCodingException -> L5d kotlinx.serialization.SerializationException -> L63 com.hatch.browser.protocol.ApiException -> L69 java.lang.Throwable -> L76
                if (r8 != r6) goto L53
                return r6
            L50:
                X.Hwg.A00(r8)     // Catch: com.hatch.browser.protocol.ApiException -> L56 java.nio.charset.CharacterCodingException -> L5d kotlinx.serialization.SerializationException -> L63 java.lang.Throwable -> L74
            L53:
                com.hatch.browser.protocol.PageCloseReceipt r8 = (com.hatch.browser.protocol.PageCloseReceipt) r8     // Catch: com.hatch.browser.protocol.ApiException -> L56 java.nio.charset.CharacterCodingException -> L5d kotlinx.serialization.SerializationException -> L63 java.lang.Throwable -> L74
                goto L58
            L56:
                r1 = move-exception
                goto L6a
            L58:
                com.facebook.aura.localbrowser.core.BrowserEngineCloseReceipt r6 = com.facebook.aura.localbrowser.core.BrowserEngineClosure.access$receipt(r1, r8)     // Catch: java.nio.charset.CharacterCodingException -> L5d kotlinx.serialization.SerializationException -> L63 com.hatch.browser.protocol.ApiException -> L69 java.lang.Throwable -> L76
                goto L70
            L5d:
                java.lang.String r0 = "Invalid close receipt encoding"
                X.CFK.A06(r4, r0)     // Catch: java.lang.Throwable -> L74
                goto L6f
            L63:
                java.lang.String r0 = "Invalid close receipt JSON"
                X.CFK.A06(r4, r0)     // Catch: java.lang.Throwable -> L74
                goto L6f
            L69:
                r1 = move-exception
            L6a:
                java.lang.String r0 = "Close receipt unavailable"
                X.CFK.A0A(r4, r0, r1)     // Catch: java.lang.Throwable -> L74
            L6f:
                r6 = r3
            L70:
                r2.Ahe(r3)
                return r6
            L74:
                r0 = move-exception
                goto L77
            L76:
                r0 = move-exception
            L77:
                r2.Ahe(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserEngineClosure.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngineClosure$settle$2", f = "BrowserEngineClosure.kt", l = {104, 54, 114}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngineClosure$settle$2, reason: invalid class name and case insensitive filesystem */
    public final class C124992 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        public C124992(HtJ<? super C124992> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserEngineClosure.this.new C124992(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return BrowserEngineClosure.this.new C124992(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        
            if (r1.APs(null, r10) == r7) goto L13;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008d A[Catch: all -> 0x00a2, TryCatch #2 {all -> 0x00a2, blocks: (B:29:0x0083, B:35:0x0093, B:36:0x009a, B:34:0x008d), top: B:52:0x0083 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                X.Hji r7 = X.EnumC10460Hji.A02
                int r0 = r10.label
                r9 = 0
                java.lang.String r4 = "BrowserEngineClosure"
                r8 = 3
                r6 = 2
                r5 = 1
                r3 = 0
                if (r0 == 0) goto L34
                if (r0 == r5) goto L28
                if (r0 == r6) goto L65
                if (r0 != r8) goto L23
                java.lang.Object r6 = r10.L$2
                com.facebook.aura.localbrowser.core.BrowserEngineClosure r6 = (com.facebook.aura.localbrowser.core.BrowserEngineClosure) r6
                java.lang.Object r5 = r10.L$1
                X.BLa r5 = (X.InterfaceC2261BLa) r5
                java.lang.Object r2 = r10.L$0
                com.hatch.browser.protocol.PageCloseReceipt r2 = (com.hatch.browser.protocol.PageCloseReceipt) r2
                X.Hwg.A00(r11)
                goto L83
            L23:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L28:
                java.lang.Object r2 = r10.L$1
                com.facebook.aura.localbrowser.core.BrowserEngineClosure r2 = (com.facebook.aura.localbrowser.core.BrowserEngineClosure) r2
                java.lang.Object r1 = r10.L$0
                X.BLa r1 = (X.InterfaceC2261BLa) r1
                X.Hwg.A00(r11)
                goto L48
            L34:
                X.Hwg.A00(r11)
                com.facebook.aura.localbrowser.core.BrowserEngineClosure r2 = com.facebook.aura.localbrowser.core.BrowserEngineClosure.this
                X.BLa r1 = r2.lock
                r10.L$0 = r1
                r10.L$1 = r2
                r10.label = r5
                java.lang.Object r0 = r1.APs(r3, r10)
                if (r0 != r7) goto L48
            L47:
                return r7
            L48:
                com.hatch.browser.protocol.PageCloseReceipt r0 = r2.completed     // Catch: java.lang.Throwable -> Lb2
                if (r0 == 0) goto L51
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> Lb2
                goto L7e
            L51:
                r1.Ahe(r3)
                com.facebook.aura.localbrowser.core.BrowserEngineClosure r0 = com.facebook.aura.localbrowser.core.BrowserEngineClosure.this     // Catch: com.hatch.browser.protocol.ApiException -> La7
                com.hatch.browser.core.PageClosure r0 = r0.closure     // Catch: com.hatch.browser.protocol.ApiException -> La7
                r10.L$0 = r3     // Catch: com.hatch.browser.protocol.ApiException -> La7
                r10.L$1 = r3     // Catch: com.hatch.browser.protocol.ApiException -> La7
                r10.label = r6     // Catch: com.hatch.browser.protocol.ApiException -> La7
                java.lang.Object r11 = r0.awaitSettlement(r10)     // Catch: com.hatch.browser.protocol.ApiException -> La7
                if (r11 != r7) goto L68
                goto L82
            L65:
                X.Hwg.A00(r11)     // Catch: com.hatch.browser.protocol.ApiException -> La7
            L68:
                com.hatch.browser.protocol.PageCloseReceipt r11 = (com.hatch.browser.protocol.PageCloseReceipt) r11     // Catch: com.hatch.browser.protocol.ApiException -> La7
                com.facebook.aura.localbrowser.core.BrowserEngineClosure r6 = com.facebook.aura.localbrowser.core.BrowserEngineClosure.this
                X.BLa r5 = r6.lock
                r10.L$0 = r11
                r10.L$1 = r5
                r10.L$2 = r6
                r10.label = r8
                java.lang.Object r0 = r5.APs(r3, r10)
                if (r0 == r7) goto L47
                r2 = r11
                goto L83
            L7e:
                r1.Ahe(r3)
                return r7
            L82:
                return r7
            L83:
                com.hatch.browser.protocol.SettlementState r1 = r2.settlement     // Catch: java.lang.Throwable -> La2
                com.hatch.browser.protocol.SettlementState r0 = com.hatch.browser.protocol.SettlementState.SETTLED     // Catch: java.lang.Throwable -> La2
                if (r1 != r0) goto L8a
                r9 = 1
            L8a:
                if (r9 == 0) goto L8d
                goto L93
            L8d:
                java.lang.String r0 = "Close settlement remains pending"
                X.CFK.A06(r4, r0)     // Catch: java.lang.Throwable -> La2
                goto L9a
            L93:
                r6.completed = r2     // Catch: java.lang.Throwable -> La2
                com.hatch.browser.core.PageClosure r0 = r6.closure     // Catch: java.lang.Throwable -> La2
                r0.destroy()     // Catch: java.lang.Throwable -> La2
            L9a:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> La2
                r5.Ahe(r3)
                return r7
            La2:
                r0 = move-exception
                r5.Ahe(r3)
                throw r0
            La7:
                r1 = move-exception
                java.lang.String r0 = "Close settlement failed"
                X.CFK.A0A(r4, r0, r1)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
                return r0
            Lb2:
                r0 = move-exception
                r1.Ahe(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.core.BrowserEngineClosure.C124992.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public BrowserEngineClosure(PageClosure pageClosure) {
        C7384Etj.A0Y(pageClosure, 0);
        this.closure = pageClosure;
        this.lock = new C9258GBl();
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BrowserEngineCloseReceipt receipt(PageCloseReceipt pageCloseReceipt) {
        JsonObject jsonObject;
        C9sU c9sU = HatchJsonKt.HatchJson;
        byte[] bArrEncodePageCloseReceipt = Hatch_browser_core_uniffiKt.encodePageCloseReceipt(pageCloseReceipt);
        JsonElement jsonElementA04 = c9sU.A04(AbstractC2159Azp.A10(bArrEncodePageCloseReceipt, bArrEncodePageCloseReceipt.length));
        if (!(jsonElementA04 instanceof JsonObject) || (jsonObject = (JsonObject) jsonElementA04) == null) {
            return null;
        }
        return new BrowserEngineCloseReceipt(jsonObject, pageCloseReceipt.outcome instanceof PageCloseOutcome.Closed);
    }

    public final Object inspect(HtJ<? super BrowserEngineCloseReceipt> htJ) {
        return GAo.A00(htJ, AuraDispatchers.INSTANCE.m764default(), new AnonymousClass2(null));
    }

    public final Object settle(HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AuraDispatchers.INSTANCE.m764default(), new C124992(null));
    }
}
