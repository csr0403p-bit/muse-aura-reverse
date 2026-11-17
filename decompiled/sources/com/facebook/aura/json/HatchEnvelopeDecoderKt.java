package com.facebook.aura.json;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C9hr;
import X.F60;
import com.facebook.aura.network.transport.HatchHttpResponse;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchEnvelopeDecoderKt {
    public static final String TAG = "HatchEnvelopeDecoder";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dd  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object decodeEnvelopeWith(com.facebook.aura.network.transport.HatchHttpResponse r11, kotlin.jvm.functions.Function0<? extends X.C9hr<T>> r12, boolean r13, java.lang.String r14, java.util.Set<java.lang.Integer> r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.json.HatchEnvelopeDecoderKt.decodeEnvelopeWith(com.facebook.aura.network.transport.HatchHttpResponse, kotlin.jvm.functions.Function0, boolean, java.lang.String, java.util.Set, boolean):java.lang.Object");
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.facebook.aura.json.HatchEnvelopeDecoderKt$decodeEnvelope$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1<T> extends AbstractC7559F3s implements Function0<C9hr<T>> {
        public static final AnonymousClass1 INSTANCE = null;

        public AnonymousClass1() {
            super(0);
        }

        static {
            C7384Etj.A0P();
            throw F60.createAndThrow();
        }

        @Override // kotlin.jvm.functions.Function0
        public final C9hr<T> invoke() {
            C7384Etj.A0Q();
            throw F60.createAndThrow();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            C7384Etj.A0Q();
            throw F60.createAndThrow();
        }
    }

    public static /* synthetic */ Object decodeEnvelope$default(HatchHttpResponse hatchHttpResponse, String str, Set set, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            set = Collections.singleton(200);
        }
        C7384Etj.A0Y(set, 2);
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    public static final /* synthetic */ <T> Object decodeEnvelope(HatchHttpResponse hatchHttpResponse, String str, Set<Integer> set, boolean z) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }
}
