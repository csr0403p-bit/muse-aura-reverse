package kotlinx.serialization.json;

import X.AnonymousClass003;
import X.C07779iq;
import X.C7384Etj;
import X.C9hr;
import X.C9i3;
import X.C9iZ;
import X.C9tS;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElementSerializer;

/* loaded from: classes4.dex */
public final class JsonObjectSerializer implements C9hr<JsonObject> {
    public static final JsonObjectSerializer A01 = new JsonObjectSerializer();
    public static final C9iZ A00 = new C9iZ() { // from class: X.9iU
        public final /* synthetic */ C9iZ A00 = new C9tS(C07779iq.A01, JsonElementSerializer.A00).A00;

        @Override // X.C9iZ
        public final int AF4(String str) {
            C7384Etj.A0Y(str, 0);
            return this.A00.AF4(str);
        }

        @Override // X.C9iZ
        public final List<Annotation> AF2(int i) {
            return this.A00.AF2(i);
        }

        @Override // X.C9iZ
        public final C9iZ AF3(int i) {
            return this.A00.AF3(i);
        }

        @Override // X.C9iZ
        public final String AF5(int i) {
            return this.A00.AF5(i);
        }

        @Override // X.C9iZ
        public final int AF6() {
            return this.A00.AF6();
        }

        @Override // X.C9iZ
        public final BL8 AGs() {
            return this.A00.AGs();
        }

        @Override // X.C9iZ
        public final String AKP() {
            return "kotlinx.serialization.json.JsonObject";
        }

        @Override // X.C9iZ
        public final boolean AOL(int i) {
            return this.A00.AOL(i);
        }

        @Override // X.C9iZ
        public final boolean AOo() {
            return this.A00.AOo();
        }

        @Override // X.C9iZ
        public final List<Annotation> getAnnotations() {
            return this.A00.getAnnotations();
        }

        @Override // X.C9iZ
        public final boolean isInline() {
            return this.A00.isInline();
        }
    };

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9i3.A00(interfaceC07829iw);
        return new JsonObject((Map) new C9tS(C07779iq.A01, JsonElementSerializer.A00).A05(interfaceC07829iw));
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A00;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        AnonymousClass003.A0u(interfaceC07789is, obj);
        C9i3.A01(interfaceC07789is);
        new C9tS(C07779iq.A01, JsonElementSerializer.A00).serialize(interfaceC07789is, obj);
    }
}
