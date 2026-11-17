package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.voltron.api.exception.VoltronMetadataAccessException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CDI {
    public static CDI A06;
    public static final CDY A07 = new CDY();
    public boolean A00;
    public final BitSet A01 = new BitSet(6);
    public final Set<String> A02 = C60O.A13();
    public final String[] A05 = new String[6];
    public final String[] A03 = new String[6];
    public final String[] A04 = new String[6];

    public static final String A00(int i) {
        return i != -2 ? i == -1 ? "MODULE_NAME_ROOT" : i >= 0 ? CCn.getModuleName(i) : "MODULE_NAME_ERROR" : "MODULE_NAME_NON_MODULAR_BUILD";
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r3v0 X.CDI) */
    public static final synchronized String A01(CDI cdi, Integer num, String str) {
        synchronized (cdi) {
            if (!cdi.A00) {
                throw new VoltronMetadataAccessException(FGI.A0M("Voltron metadata accessed violation: ", "Voltron metadata is not loaded"));
            }
            int iA00 = CCn.A00(str);
            if (iA00 >= 0) {
                return num.intValue() != 0 ? cdi.A03[iA00] : cdi.A05[iA00];
            }
            return null;
        }
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r3v0 X.CDI) */
    public static final synchronized String A02(CDI cdi, Integer num, String str) {
        synchronized (cdi) {
            if (!cdi.A00) {
                throw new VoltronMetadataAccessException(FGI.A0M("Voltron metadata accessed violation: ", "Voltron metadata is not loaded"));
            }
            int iA00 = CCn.A00(str);
            if (iA00 < 0) {
                iA00 = -3;
            }
            if (!A04(iA00)) {
                return null;
            }
            if (num.intValue() != 0) {
                str = cdi.A04[iA00];
            }
            return str;
        }
    }

    public final synchronized boolean A06(String str) {
        synchronized (this) {
            int iA00 = CCn.A00(str);
            if (iA00 >= 0) {
                return this.A05[iA00] != null ? this.A01.get(iA00) : false;
            }
            return true;
        }
    }

    private final void A03(CDL cdl, Integer num, String str) {
        int iA00;
        if (str == null) {
            iA00 = -1;
        } else {
            iA00 = CCn.A00(str);
            if (iA00 < 0) {
                iA00 = -3;
            }
        }
        String str2 = cdl.A01;
        synchronized (this) {
            C7384Etj.A0Y(str2, 1);
            if (num == C79.A01 && A04(iA00)) {
                this.A04[iA00] = str2;
            }
        }
        String str3 = cdl.A00;
        synchronized (this) {
            C7384Etj.A0Y(str3, 1);
            if (A04(iA00)) {
                if (num.intValue() != 0) {
                    this.A03[iA00] = str3;
                } else {
                    this.A05[iA00] = str3;
                }
                if (CFK.A02.AOg(3)) {
                    A00(iA00);
                }
            }
        }
        if (num == C79.A00) {
            boolean z = cdl.A03;
            synchronized (this) {
                if (A04(iA00)) {
                    this.A01.set(iA00, z);
                    if (CFK.A02.AOg(3)) {
                        A00(iA00);
                    }
                }
            }
        }
        if (cdl.A04) {
            this.A02.add(str);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.9jH] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final synchronized boolean A05(Context context) {
        int iA00;
        if (!this.A00) {
            Trace.beginSection("AppModuleMetadataCache.loadModuleMetadatas");
            try {
                if (C03.A00(context)) {
                    Trace.beginSection("AppModuleMetadataCache.getPostprocessorModuleMetadata");
                    try {
                        AssetManager assets = context.getAssets();
                        try {
                            InputStream inputStreamOpen = assets.open("app_modules.json");
                            C7384Etj.A0U(inputStreamOpen);
                            JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStreamOpen, HatchWebPageParserKt.UTF_8));
                            try {
                                ?? A0h = C0881AGi.A00;
                                jsonReader.beginObject();
                                ArrayList arrayListA0h = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName = jsonReader.nextName();
                                    if ("downloadable".equals(strNextName)) {
                                        new CDW();
                                        A0h = C3cG.A0h();
                                        jsonReader.beginArray();
                                        while (jsonReader.hasNext() && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                                            ?? A0E = AGH.A0E();
                                            jsonReader.beginObject();
                                            Boolean boolValueOf = null;
                                            Boolean boolValueOf2 = null;
                                            String strNextString = null;
                                            String strNextString2 = null;
                                            while (jsonReader.hasNext()) {
                                                String strNextName2 = jsonReader.nextName();
                                                if (strNextName2 != null) {
                                                    switch (strNextName2.hashCode()) {
                                                        case 3195150:
                                                            if (!strNextName2.equals("hash")) {
                                                                break;
                                                            } else {
                                                                strNextString2 = jsonReader.nextString();
                                                            }
                                                        case 3373707:
                                                            if (!strNextName2.equals("name")) {
                                                                break;
                                                            } else {
                                                                strNextString = jsonReader.nextString();
                                                            }
                                                        case 270940796:
                                                            if (!strNextName2.equals("disabled")) {
                                                                break;
                                                            } else {
                                                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                                            }
                                                        case 1385644488:
                                                            if (!strNextName2.equals("requires_native")) {
                                                                break;
                                                            } else {
                                                                boolValueOf2 = Boolean.valueOf(jsonReader.nextBoolean());
                                                            }
                                                        case 1500252240:
                                                            if (!strNextName2.equals("abi_splits")) {
                                                                break;
                                                            } else {
                                                                A0E = C3cG.A0j();
                                                                jsonReader.beginObject();
                                                                while (jsonReader.hasNext()) {
                                                                    String strNextName3 = jsonReader.nextName();
                                                                    EnumC3179C1j enumC3179C1j = EnumC3179C1j.A04;
                                                                    if (C7384Etj.areEqual(strNextName3, enumC3179C1j.abi)) {
                                                                        A0E.put(enumC3179C1j, jsonReader.nextString());
                                                                    } else {
                                                                        EnumC3179C1j enumC3179C1j2 = EnumC3179C1j.A05;
                                                                        if (C7384Etj.areEqual(strNextName3, enumC3179C1j2.abi)) {
                                                                            A0E.put(enumC3179C1j2, jsonReader.nextString());
                                                                        } else {
                                                                            EnumC3179C1j enumC3179C1j3 = EnumC3179C1j.A03;
                                                                            if (C7384Etj.areEqual(strNextName3, enumC3179C1j3.abi)) {
                                                                                A0E.put(enumC3179C1j3, jsonReader.nextString());
                                                                            } else {
                                                                                EnumC3179C1j enumC3179C1j4 = EnumC3179C1j.A02;
                                                                                if (!C7384Etj.areEqual(strNextName3, enumC3179C1j4.abi)) {
                                                                                    throw BV5.A0h("unknown key ", strNextName3);
                                                                                }
                                                                                A0E.put(enumC3179C1j4, jsonReader.nextString());
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                jsonReader.endObject();
                                                            }
                                                    }
                                                }
                                                throw BV5.A0h("unknown key ", strNextName2);
                                            }
                                            jsonReader.endObject();
                                            if (strNextString == null) {
                                                throw C3cG.A0Q("Required value was null.");
                                            }
                                            if (strNextString2 == null) {
                                                throw C3cG.A0Q("Required value was null.");
                                            }
                                            if (boolValueOf == null) {
                                                throw C3cG.A0Q("Required value was null.");
                                            }
                                            if (boolValueOf2 == null) {
                                                throw C3cG.A0Q("Required value was null.");
                                            }
                                            A0h.add(new CDL(strNextString, A0E, strNextString2, boolValueOf.booleanValue(), boolValueOf2.booleanValue()));
                                        }
                                        jsonReader.endArray();
                                    } else {
                                        if (!"built_in".equals(strNextName)) {
                                            throw BV5.A0h("unknown key ", strNextName);
                                        }
                                        new CDX();
                                        arrayListA0h = C3cG.A0h();
                                        jsonReader.beginArray();
                                        while (jsonReader.hasNext() && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                                            jsonReader.beginObject();
                                            String strNextString3 = null;
                                            Boolean boolValueOf3 = null;
                                            while (jsonReader.hasNext()) {
                                                String strNextName4 = jsonReader.nextName();
                                                if ("name".equals(strNextName4)) {
                                                    strNextString3 = jsonReader.nextString();
                                                } else {
                                                    if (!"requires_native".equals(strNextName4)) {
                                                        throw BV5.A0h("unknown key ", strNextName4);
                                                    }
                                                    boolValueOf3 = Boolean.valueOf(jsonReader.nextBoolean());
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (strNextString3 == null) {
                                                throw C3cG.A0Q("Required value was null.");
                                            }
                                            if (boolValueOf3 == null) {
                                                throw C3cG.A0Q("Required value was null.");
                                            }
                                            arrayListA0h.add(new CDM(strNextString3, boolValueOf3.booleanValue()));
                                        }
                                        jsonReader.endArray();
                                    }
                                }
                                jsonReader.endObject();
                                if (arrayListA0h == null) {
                                    throw C3cG.A0Q("Required value was null.");
                                }
                                int iA0H = AIW.A0H(Hr7.A1D(A0h, 10));
                                if (iA0H < 16) {
                                    iA0H = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(iA0H);
                                for (Object obj : A0h) {
                                    linkedHashMap.put(((CDL) obj).A01, obj);
                                }
                                Trace.endSection();
                                HashSet hashSetA13 = C60O.A13();
                                int i = 0;
                                do {
                                    hashSetA13.add(A00(i));
                                    i++;
                                } while (i < 6);
                                EnumC3179C1j enumC3179C1jA00 = EnumC3179C1j.A00();
                                Trace.beginSection("AppModuleMetadataCache.setMetadata");
                                Iterator it = hashSetA13.iterator();
                                while (it.hasNext()) {
                                    String strA0j = AnonymousClass005.A0j(it);
                                    if (CCn.A01(strA0j) == BY3.A03 && (iA00 = CCn.A00(strA0j)) != 0 && iA00 != 1) {
                                        CDL cdl = (CDL) linkedHashMap.get(strA0j);
                                        if (cdl == null) {
                                            CFK.A0F("AppModuleMetadataCache", "map keys: %s", linkedHashMap.keySet());
                                            throw BV5.A0i("Module ", strA0j, " is not present in downloadable metadata map");
                                        }
                                        A03(cdl, C79.A00, strA0j);
                                        String strA0p = C60O.A0p(enumC3179C1jA00, cdl.A02);
                                        if (strA0p == null) {
                                            continue;
                                        } else {
                                            CDL cdl2 = (CDL) linkedHashMap.get(strA0p);
                                            if (cdl2 == null) {
                                                CFK.A0F("AppModuleMetadataCache", "map keys: %s", linkedHashMap.keySet());
                                                throw BV4.A0c(FGI.A0h("Module abi split name: ", strA0p, " for feature module: ", strA0j, " is not present in downloadable metadata map"));
                                            }
                                            A03(cdl2, C79.A01, strA0j);
                                        }
                                    }
                                }
                                Iterator it2 = arrayListA0h.iterator();
                                while (it2.hasNext()) {
                                    CDM cdm = (CDM) it2.next();
                                    if (cdm.A01) {
                                        this.A02.add(cdm.A00);
                                    }
                                }
                                Trace.endSection();
                                this.A00 = true;
                            } finally {
                                jsonReader.close();
                            }
                        } catch (FileNotFoundException e) {
                            Locale locale = Locale.US;
                            String string = Arrays.toString(assets.list(""));
                            C7384Etj.A0U(string);
                            throw new IOException(String.format(locale, "app_modules.json not found, assets = %s", Arrays.copyOf(new Object[]{string}, 1)), e);
                        }
                    } finally {
                    }
                } else {
                    this.A00 = true;
                }
                Trace.endSection();
            } catch (IOException e2) {
                CFK.A0L("AppModuleMetadataCache", e2, "Error loading downloadable module metadata");
                return false;
            } finally {
            }
        }
        return true;
    }

    public static final boolean A04(int i) {
        boolean zA1Q = C8j3.A1Q(i);
        if (!zA1Q) {
            Object[] objArr = {A00(i), Integer.valueOf(i)};
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 2);
            CFK.A07("AppModuleIndexUtil", String.format(locale, "Checking index for %s (%d)", Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
        }
        return zA1Q;
    }
}
