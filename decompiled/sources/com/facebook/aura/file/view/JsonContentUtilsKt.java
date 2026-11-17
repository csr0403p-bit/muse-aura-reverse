package com.facebook.aura.file.view;

import X.A6B;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C7384Etj;
import X.C7AG;
import X.C8iN;
import X.C9sR;
import X.C9sU;
import X.G0U;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class JsonContentUtilsKt {
    public static final C9sU PrettyJson = C9sR.A00(JsonContentUtilsKt$PrettyJson$1.INSTANCE, C9sU.A03);

    /* renamed from: com.facebook.aura.file.view.JsonContentUtilsKt$formatJsonl$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final String invoke(String str) {
            C7384Etj.A0Y(str, 0);
            String strA0l = AnonymousClass002.A0l(str);
            if (strA0l.length() == 0) {
                return str;
            }
            try {
                JsonElement jsonElementA04 = C9sU.A03.A04(strA0l);
                return ((jsonElementA04 instanceof JsonObject) || (jsonElementA04 instanceof JsonArray)) ? JsonContentUtilsKt.PrettyJson.A02(jsonElementA04, JsonElementSerializer.A00) : str;
            } catch (Exception unused) {
                return str;
            }
        }
    }

    public static final String formatJson(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() == 0) {
            return str;
        }
        try {
            JsonElement jsonElementA04 = C9sU.A03.A04(strA0l);
            return ((jsonElementA04 instanceof JsonObject) || (jsonElementA04 instanceof JsonArray)) ? PrettyJson.A02(jsonElementA04, JsonElementSerializer.A00) : str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static final String formatJsonl(String str) {
        C7384Etj.A0Y(str, 0);
        C8iN c8iN = new C8iN(str, 1);
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AnonymousClass003.A0u(c8iN, anonymousClass1);
        return A6B.A01(PairsDiscretionDocument.TERMINATOR, new C7AG(anonymousClass1, c8iN));
    }

    public static /* synthetic */ void getPrettyJson$annotations() {
    }
}
