package com.facebook.aura.gateway;

import X.C0861A6i;
import X.C3cG;
import X.C7384Etj;
import X.C9Y;
import X.C9hr;
import X.C9i0;
import X.C9jG;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes2.dex */
public final class ApprovalRequestPreviewBlockJsonSerializer extends C9i0<ApprovalRequestPreviewBlockJson> {
    public static final int $stable = 0;
    public static final ApprovalRequestPreviewBlockJsonSerializer INSTANCE = new ApprovalRequestPreviewBlockJsonSerializer();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C9i0
    public C9jG<ApprovalRequestPreviewBlockJson> selectDeserializer(JsonElement jsonElement) {
        JsonObject jsonObject;
        JsonPrimitive jsonPrimitive;
        String strA00;
        C7384Etj.A0Y(jsonElement, 0);
        if (!(jsonElement instanceof JsonObject) || (jsonObject = (JsonObject) jsonElement) == null) {
            throw new SerializationException("Block must be an object");
        }
        Object obj = jsonObject.get("type");
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && jsonPrimitive.A01() && (strA00 = jsonPrimitive.A00()) != null) {
            switch (strA00.hashCode()) {
                case -1274708295:
                    if (strA00.equals("fields")) {
                        int i = ApprovalRequestPreviewFieldsBlockJson.$stable;
                        return ApprovalRequestPreviewFieldsBlockJson$$serializer.INSTANCE;
                    }
                    break;
                case -738997328:
                    if (strA00.equals(C9Y.BUG_REPORT_ATTACHMENTS_ENDPOINT)) {
                        int i2 = ApprovalRequestPreviewAttachmentsBlockJson.$stable;
                        return ApprovalRequestPreviewAttachmentsBlockJson$$serializer.INSTANCE;
                    }
                    break;
                case 3322014:
                    if (strA00.equals("list")) {
                        int i3 = ApprovalRequestPreviewListBlockJson.$stable;
                        return ApprovalRequestPreviewListBlockJson$$serializer.INSTANCE;
                    }
                    break;
                case 3556653:
                    if (strA00.equals("text")) {
                        return ApprovalRequestPreviewTextBlockJson$$serializer.INSTANCE;
                    }
                    break;
                case 102977465:
                    if (strA00.equals("links")) {
                        int i4 = ApprovalRequestPreviewLinksBlockJson.$stable;
                        return ApprovalRequestPreviewLinksBlockJson$$serializer.INSTANCE;
                    }
                    break;
            }
        }
        throw new SerializationException("Unsupported approval request preview block");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ApprovalRequestPreviewBlockJsonSerializer() {
        final C0861A6i c0861A6iA0x = C3cG.A0x(ApprovalRequestPreviewBlockJson.class);
        new C9hr<T>(c0861A6iA0x) { // from class: X.9i0
            public final C9uG<T> baseClass;
            public final C9iZ descriptor;

            {
                C7384Etj.A0Y(c0861A6iA0x, 0);
                this.baseClass = c0861A6iA0x;
                this.descriptor = C9iY.A03(FGI.A0N("JsonContentPolymorphicSerializer<", C8j3.A12(c0861A6iA0x), '>'), C9hy.A00);
            }

            @Override // X.C9jG
            public final T deserialize(InterfaceC07829iw interfaceC07829iw) {
                C7384Etj.A0Y(interfaceC07829iw, 0);
                BNA bnaA00 = C9i3.A00(interfaceC07829iw);
                JsonElement jsonElementA8V = bnaA00.A8V();
                C9jG<T> c9jGSelectDeserializer = selectDeserializer(jsonElementA8V);
                C7384Etj.A0Z(c9jGSelectDeserializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
                C9sU c9sUAGk = bnaA00.AGk();
                C7384Etj.A0Y(jsonElementA8V, 1);
                return (T) C9sZ.A00(c9jGSelectDeserializer, c9sUAGk, jsonElementA8V);
            }

            public abstract C9jG<T> selectDeserializer(JsonElement jsonElement);

            @Override // X.C9hr, X.C9hv, X.C9jG
            public C9iZ getDescriptor() {
                return this.descriptor;
            }

            private final Void throwSubtypeNotRegistered(C9uG<?> c9uG, C9uG<?> c9uG2) {
                String strA12 = C8j3.A12(c9uG);
                if (strA12 == null) {
                    strA12 = String.valueOf(c9uG);
                }
                throw new SerializationException(FGI.A0h("Class '", strA12, "' is not registered for polymorphic serialization ", FGI.A0N("in the scope of '", C8j3.A12(c9uG2), '\''), ".\nMark the base class as 'sealed' or register the serializer explicitly."));
            }

            @Override // X.C9hv
            public final void serialize(InterfaceC07789is interfaceC07789is, T t) {
                AnonymousClass003.A0u(interfaceC07789is, t);
                C9hv c9hvA01 = interfaceC07789is.AKT().A01(t, this.baseClass);
                if (c9hvA01 == null) {
                    Class<?> cls = t.getClass();
                    c9hvA01 = C9u8.A02(C3cG.A0x(cls));
                    if (c9hvA01 == null) {
                        throwSubtypeNotRegistered(C3cG.A0x(cls), this.baseClass);
                        throw F60.createAndThrow();
                    }
                }
                c9hvA01.serialize(interfaceC07789is, t);
            }
        };
    }
}
