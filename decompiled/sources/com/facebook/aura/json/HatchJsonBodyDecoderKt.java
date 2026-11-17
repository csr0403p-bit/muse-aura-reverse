package com.facebook.aura.json;

import X.AbstractC07979sd;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C9jG;
import X.F60;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchJsonBodyDecoderKt {
    public static final int CARRIAGE_RETURN = 13;
    public static final int HORIZONTAL_TAB = 9;
    public static final int LINE_FEED = 10;
    public static final int SPACE = 32;

    public static final <T> T decodeJsonBodyWith(InputStream inputStream, Function0<? extends C9jG<? extends T>> function0) {
        InputStream inputStreamJsonContentOrNull;
        C7384Etj.A0Y(function0, 1);
        if (inputStream == null || (inputStreamJsonContentOrNull = jsonContentOrNull(inputStream)) == null) {
            return null;
        }
        return (T) AbstractC07979sd.A00(inputStreamJsonContentOrNull, function0.invoke(), HatchJsonKt.HatchJson);
    }

    public static final InputStream jsonContentOrNull(InputStream inputStream) throws IOException {
        int i;
        C7384Etj.A0Y(inputStream, 0);
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 1);
        do {
            i = pushbackInputStream.read();
            if (i < 0) {
                return null;
            }
        } while (isJsonWhitespace(i));
        pushbackInputStream.unread(i);
        return pushbackInputStream;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.facebook.aura.json.HatchJsonBodyDecoderKt$decodeJsonBodyOrNull$1, reason: invalid class name */
    public final class AnonymousClass1<T> extends AbstractC7559F3s implements Function0<C9jG<? extends T>> {
        public static final AnonymousClass1 INSTANCE = null;

        public AnonymousClass1() {
            super(0);
        }

        static {
            C7384Etj.A0P();
            throw F60.createAndThrow();
        }

        @Override // kotlin.jvm.functions.Function0
        public final C9jG<T> invoke() {
            C7384Etj.A0Q();
            throw F60.createAndThrow();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            C7384Etj.A0Q();
            throw F60.createAndThrow();
        }
    }

    public static final boolean isJsonWhitespace(int i) {
        return i == 32 || i == 9 || i == 10 || i == 13;
    }

    public static final /* synthetic */ <T> T decodeJsonBodyOrNull(InputStream inputStream) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }
}
