package com.facebook.aura.nodes.core;

import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC7536F0j;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C9oY;
import X.C9sR;
import X.C9sU;
import X.F60;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class NodeWireJsonKt {
    public static final C9sU NodeJson = C9sR.A00(NodeWireJsonKt$NodeJson$1.INSTANCE, C9sU.A03);

    public static final String encodeCompact(JsonElement jsonElement) throws IOException {
        C7384Etj.A0Y(jsonElement, 0);
        StringBuilder sbA0w = C60O.A0w();
        appendJson(sbA0w, jsonElement, false);
        return sbA0w.toString();
    }

    public static final C9sU getNodeJson() {
        return NodeJson;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void appendJson(Appendable appendable, JsonElement jsonElement, boolean z) throws IOException {
        char c;
        AnonymousClass003.A0u(appendable, jsonElement);
        int i = 0;
        if (jsonElement instanceof JsonObject) {
            appendable.append('{');
            Collection collectionEntrySet = ((JsonObject) jsonElement).entrySet();
            if (z) {
                collectionEntrySet = AbstractC0878AGe.A0c(collectionEntrySet, new Comparator() { // from class: com.facebook.aura.nodes.core.NodeWireJsonKt$appendJson$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return AbstractC7536F0j.A00(C60O.A0t((Map.Entry) t), C60O.A0t((Map.Entry) t2));
                    }
                });
            }
            Iterator it = collectionEntrySet.iterator();
            boolean z2 = true;
            while (it.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it);
                String strA0t = C60O.A0t(entryA0l);
                JsonElement jsonElement2 = (JsonElement) entryA0l.getValue();
                if (!z2) {
                    appendable.append(',');
                }
                appendable.append(C9oY.A07(strA0t).toString());
                appendable.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
                appendJson(appendable, jsonElement2, z);
                z2 = false;
            }
            c = '}';
        } else {
            if (!(jsonElement instanceof JsonArray)) {
                if (!(jsonElement instanceof JsonPrimitive)) {
                    throw C3cG.A0q();
                }
                appendable.append(jsonElement.toString());
                return;
            }
            appendable.append('[');
            for (Object obj : (Iterable) jsonElement) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                JsonElement jsonElement3 = (JsonElement) obj;
                if (i > 0) {
                    appendable.append(',');
                }
                appendJson(appendable, jsonElement3, z);
                i = i2;
            }
            c = ']';
        }
        appendable.append(c);
    }
}
