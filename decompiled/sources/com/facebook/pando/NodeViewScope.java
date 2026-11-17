package com.facebook.pando;

import X.AGH;
import X.ATD;
import X.AbstractC7411Euw;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C06H;
import X.C0968AJv;
import X.C3cG;
import X.C3cH;
import X.C5119DZv;
import X.C60O;
import X.C7384Etj;
import X.C9jH;
import X.DZf;
import X.DZg;
import X.DZu;
import X.HxE;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class NodeViewScope {
    public static final ConcurrentHashMap<HxE<String, Boolean>, NodeViewScope> variableFreeScopes = C60O.A1C();
    public final C5119DZv assetReader;
    public final String buildConfigName;
    public final ConcurrentHashMap<AbstractC7411Euw, String> resolvedCanonicalNames;
    public final boolean useSegmentedCanonicalArguments;
    public final DZf variables;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NodeViewScope(String str, C5119DZv c5119DZv, Map<String, String> map, Map<String, String> map2, boolean z) {
        this(str, c5119DZv, new DZf(new DZg(map, map2)), z);
        AnonymousClass005.A11(str, map, map2, 0);
    }

    public static final NodeViewScope A00(String str, C5119DZv c5119DZv, boolean z) {
        C9jH c9jHA0E;
        NodeViewScope nodeViewScope;
        C7384Etj.A0Y(str, 0);
        HxE<String, Boolean> hxEA0r = C3cG.A0r(str, Boolean.valueOf(z));
        ConcurrentHashMap<HxE<String, Boolean>, NodeViewScope> concurrentHashMap = variableFreeScopes;
        NodeViewScope nodeViewScopePutIfAbsent = concurrentHashMap.get(hxEA0r);
        return (nodeViewScopePutIfAbsent == null && (nodeViewScopePutIfAbsent = concurrentHashMap.putIfAbsent(hxEA0r, (nodeViewScope = new NodeViewScope(str, c5119DZv, (c9jHA0E = AGH.A0E()), c9jHA0E, z)))) == null) ? nodeViewScope : nodeViewScopePutIfAbsent;
    }

    public final boolean booleanVariableValue(String str) {
        Object obj;
        C7384Etj.A0Y(str, 0);
        Map map = (Map) this.variables.A01.getValue();
        Map map2 = (Map) this.variables.A02.getValue();
        if (map.containsKey(str)) {
            obj = map.get(str);
        } else {
            if (!map2.containsKey(str)) {
                return false;
            }
            obj = map2.get(str);
        }
        Boolean boolEncodedBoolean = encodedBoolean((String) obj);
        if (boolEncodedBoolean != null) {
            return boolEncodedBoolean.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf A[PHI: r0
  0x00bf: PHI (r0v20 X.Euw) = (r0v19 X.Euw), (r0v24 X.Euw) binds: [B:38:0x00ae, B:42:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd A[PHI: r0
  0x00fd: PHI (r0v31 X.Euw) = (r0v30 X.Euw), (r0v34 X.Euw) binds: [B:21:0x0061, B:51:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String canonicalNameFor(X.Da6 r10) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.pando.NodeViewScope.canonicalNameFor(X.Da6):java.lang.String");
    }

    public final DZu fragmentForNameHash(int i, String str) {
        C7384Etj.A0Y(str, 1);
        C5119DZv c5119DZv = this.assetReader;
        if (c5119DZv != null) {
            return c5119DZv.A01(i, str);
        }
        return null;
    }

    public final boolean hasVariableValue(String str) {
        Object obj;
        C7384Etj.A0Y(str, 0);
        Map map = (Map) this.variables.A01.getValue();
        Map map2 = (Map) this.variables.A02.getValue();
        if (!map.containsKey(str)) {
            if (map2.containsKey(str)) {
                obj = map2.get(str);
            }
        }
        obj = map.get(str);
        return !C7384Etj.areEqual(obj, HatchCcvLoggingKt.NO_POSTAL_FIELD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String substituteQueryVariables(String str) {
        C7384Etj.A0Y(str, 0);
        Map map = (Map) this.variables.A01.getValue();
        C7384Etj.A0Y(map, 1);
        String[] strArrA00 = AbstractC7411Euw.A00(str);
        int length = strArrA00.length;
        if (length == 1) {
            return strArrA00[0];
        }
        C0968AJv c0968AJvA0B = ATD.A0B(ATD.A0C(1, length), 2);
        int i = c0968AJvA0B.A00;
        int i2 = c0968AJvA0B.A01;
        int i3 = c0968AJvA0B.A02;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (true) {
                Object obj = map.get(strArrA00[i]);
                if (obj == null) {
                    obj = "def";
                }
                strArrA00[i] = obj;
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        return BFI.A0B("", "", "", null, strArrA00);
    }

    public final C5119DZv getAssetReader() {
        return this.assetReader;
    }

    public final String getBuildConfigName() {
        return this.buildConfigName;
    }

    public final boolean getUseSegmentedCanonicalArguments() {
        return this.useSegmentedCanonicalArguments;
    }

    public final DZf getVariables() {
        return this.variables;
    }

    private final Boolean encodedBoolean(String str) {
        boolean z;
        if ("true".equals(str)) {
            z = true;
        } else {
            if (!"false".equals(str)) {
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final NodeViewScope variableFree(String str, C5119DZv c5119DZv, boolean z) {
        return A00(str, c5119DZv, z);
    }

    public /* synthetic */ NodeViewScope(String str, C5119DZv c5119DZv, Map map, Map map2, boolean z, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : c5119DZv, C3cH.A0o(map, i & 4), C3cH.A0o(map2, i & 8), C3cG.A1K(i & 16, z));
    }

    public NodeViewScope(String str, C5119DZv c5119DZv, DZf dZf, boolean z) {
        AnonymousClass003.A0v(str, dZf);
        this.buildConfigName = str;
        this.assetReader = c5119DZv;
        this.variables = dZf;
        this.useSegmentedCanonicalArguments = z;
        this.resolvedCanonicalNames = C60O.A1C();
    }

    public /* synthetic */ NodeViewScope(String str, C5119DZv c5119DZv, DZf dZf, boolean z, int i, C06H c06h) {
        this(str, c5119DZv, dZf, (i & 8) != 0 ? false : z);
    }
}
