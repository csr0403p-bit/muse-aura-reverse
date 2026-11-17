package com.facebook.aura.model;

import X.A6B;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C3av;
import X.C7384Etj;
import X.C9oY;
import X.G0U;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes.dex */
public abstract class GenericListPresentationKt {
    public static final String GENERIC_LIST_ROW_TYPE_CALENDAR = "calendar";
    public static final String GENERIC_LIST_ROW_TYPE_EMAIL = "email";
    public static final String GENERIC_LIST_ROW_TYPE_FILE = "file";
    public static final String GENERIC_LIST_ROW_TYPE_FLIGHT = "flight";
    public static final String GENERIC_LIST_ROW_TYPE_GENERIC = "generic";
    public static final String GENERIC_LIST_ROW_TYPE_LINK = "link";
    public static final String GENERIC_LIST_ROW_TYPE_SEND_MESSAGE = "send_message";

    /* renamed from: com.facebook.aura.model.GenericListPresentationKt$genericListSelectedText$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, String> {
        public final /* synthetic */ JSONState $state;

        @Override // X.G0U
        public final String invoke(String str) {
            JsonPrimitive jsonPrimitive;
            C7384Etj.A0Y(str, 0);
            Object obj = this.$state.data.get(str);
            if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && jsonPrimitive.A01()) {
                return C9oY.A04(jsonPrimitive);
            }
            return null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JSONState jSONState) {
            super(1);
            this.$state = jSONState;
        }
    }

    public static final String genericListSelectedText(JSONState jSONState) {
        C7384Etj.A0Y(jSONState, 0);
        return (String) A6B.A00(A6B.A04(new AnonymousClass1(jSONState), new C3av(new String[]{"selectedText", "selected_text", "selection"})));
    }

    public static final boolean genericListSelectionLocked(JSONState jSONState) {
        C7384Etj.A0Y(jSONState, 0);
        Object obj = jSONState.data.get("locked");
        JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
        return (jsonPrimitive != null && AnonymousClass002.A1b(C9oY.A01(jsonPrimitive), true)) || genericListSelectedText(jSONState) != null;
    }
}
