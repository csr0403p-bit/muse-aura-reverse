package com.facebook.aura.gateway;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class EditableMessageEditorResultJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final EditableMessageEditorJson editor;

    public final class Companion {
        public final C9hr<EditableMessageEditorResultJson> serializer() {
            return EditableMessageEditorResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final EditableMessageEditorResultJson copy(EditableMessageEditorJson editableMessageEditorJson) {
        C7384Etj.A0Y(editableMessageEditorJson, 0);
        return new EditableMessageEditorResultJson(editableMessageEditorJson);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EditableMessageEditorResultJson) && C7384Etj.areEqual(this.editor, ((EditableMessageEditorResultJson) obj).editor));
    }

    public /* synthetic */ EditableMessageEditorResultJson(int i, EditableMessageEditorJson editableMessageEditorJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EditableMessageEditorResultJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.editor = editableMessageEditorJson;
    }

    public static /* synthetic */ EditableMessageEditorResultJson copy$default(EditableMessageEditorResultJson editableMessageEditorResultJson, EditableMessageEditorJson editableMessageEditorJson, int i, Object obj) {
        if ((i & 1) != 0) {
            editableMessageEditorJson = editableMessageEditorResultJson.editor;
        }
        C7384Etj.A0Y(editableMessageEditorJson, 0);
        return new EditableMessageEditorResultJson(editableMessageEditorJson);
    }

    public final EditableMessageEditorJson component1() {
        return this.editor;
    }

    public final EditableMessageEditorJson getEditor() {
        return this.editor;
    }

    public int hashCode() {
        return this.editor.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public EditableMessageEditorResultJson(EditableMessageEditorJson editableMessageEditorJson) {
        C7384Etj.A0Y(editableMessageEditorJson, 0);
        this.editor = editableMessageEditorJson;
    }
}
