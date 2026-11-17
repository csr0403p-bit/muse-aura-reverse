package X;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class Ab8 implements AbB {
    public static final int $stable = 0;
    public ASF _inspectorValues;

    /* JADX WARN: Incorrect return type in method signature: ()TN; */
    public abstract AbstractC1439Aj8 create();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    /* JADX WARN: Incorrect types in method signature: (TN;)V */
    public abstract void update(AbstractC1439Aj8 abstractC1439Aj8);

    private final ASF getInspectorValues() throws SecurityException {
        ASF asf = this._inspectorValues;
        if (asf != null) {
            return asf;
        }
        ASF asf2 = new ASF();
        asf2.A01 = C60O.A0n(this);
        inspectableProperties(asf2);
        this._inspectorValues = asf2;
        return asf2;
    }

    public static void A03(BHD bhd, boolean z) {
        bhd.A01("enabled", Boolean.valueOf(z));
    }

    @Override // X.BRg
    public /* synthetic */ boolean all(G0U g0u) {
        return ((Boolean) g0u.invoke(this)).booleanValue();
    }

    public /* synthetic */ boolean any(G0U g0u) {
        return AnonymousClass003.A1X(this, g0u);
    }

    @Override // X.BRg
    public /* synthetic */ Object foldIn(Object obj, G0V g0v) {
        return g0v.invoke(obj, this);
    }

    public /* synthetic */ Object foldOut(Object obj, G0V g0v) {
        return g0v.invoke(this, obj);
    }

    public final C3b6<BOx> getInspectableElements() {
        return getInspectorValues().A02;
    }

    public final String getNameFallback() {
        return getInspectorValues().A01;
    }

    public final Object getValueOverride() {
        return getInspectorValues().A00;
    }

    public void inspectableProperties(ASF asf) throws SecurityException {
        Object[] declaredFields = getClass().getDeclaredFields();
        BSF bsf = new BSF(4);
        C7384Etj.A0Y(declaredFields, 0);
        int length = declaredFields.length;
        if (length != 0) {
            declaredFields = C8j3.A1a(declaredFields, length);
            if (declaredFields.length > 1) {
                Arrays.sort(declaredFields, bsf);
            }
        }
        List listAsList = Arrays.asList(declaredFields);
        int size = listAsList.size();
        for (int i = 0; i < size; i++) {
            Field field = (Field) listAsList.get(i);
            if (!field.getDeclaringClass().isAssignableFrom(Ab8.class)) {
                try {
                    field.setAccessible(true);
                    asf.A02.A01(field.getName(), field.get(this));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }

    @Override // X.BRg
    public /* synthetic */ BRg then(BRg bRg) {
        return BRP.A00(this, bRg);
    }
}
