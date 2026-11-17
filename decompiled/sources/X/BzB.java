package X;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class BzB {
    public static final BzB A01;
    public final Map<String, Object> A00;

    public final boolean equals(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                Map<String, Object> map = this.A00;
                Set<String> setKeySet = map.keySet();
                Map<String, Object> map2 = ((BzB) obj).A00;
                if (C7384Etj.areEqual(setKeySet, map2.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map.get(str);
                        Object obj3 = map2.get(str);
                        if (obj2 != null) {
                            if (obj3 != null) {
                                if (!((!(obj2 instanceof Object[]) || (objArr = (Object[]) obj2) == null || !(obj3 instanceof Object[]) || (objArr2 = (Object[]) obj3) == null) ? obj2.equals(obj3) : C9u5.A00(objArr, objArr2))) {
                                }
                            }
                        } else if (obj2 == obj3) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final byte[] A00(BzB bzB) throws IOException {
        int i;
        String str;
        Double d;
        Float f;
        Long l;
        Integer num;
        Byte b;
        Boolean bool;
        byte bByteValue;
        try {
            ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStreamA0F);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                Map<String, Object> map = bzB.A00;
                dataOutputStream.writeInt(map.size());
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entry = (Map.Entry) itA0n.next();
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        bByteValue = 0;
                    } else {
                        if (value instanceof Boolean) {
                            dataOutputStream.writeByte(1);
                            dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                        } else if (value instanceof Byte) {
                            dataOutputStream.writeByte(2);
                            bByteValue = ((Number) value).byteValue();
                        } else if (value instanceof Integer) {
                            dataOutputStream.writeByte(3);
                            dataOutputStream.writeInt(((Number) value).intValue());
                        } else if (value instanceof Long) {
                            dataOutputStream.writeByte(4);
                            dataOutputStream.writeLong(((Number) value).longValue());
                        } else if (value instanceof Float) {
                            dataOutputStream.writeByte(5);
                            dataOutputStream.writeFloat(((Number) value).floatValue());
                        } else if (value instanceof Double) {
                            dataOutputStream.writeByte(6);
                            dataOutputStream.writeDouble(((Number) value).doubleValue());
                        } else if (value instanceof String) {
                            dataOutputStream.writeByte(7);
                            dataOutputStream.writeUTF((String) value);
                        } else {
                            if (!(value instanceof Object[])) {
                                throw C60Q.A0U("Unsupported value type ", C60O.A0n(value));
                            }
                            Object[] objArr = (Object[]) value;
                            Class<?> cls = objArr.getClass();
                            C0861A6i c0861A6i = new C0861A6i(cls);
                            if (c0861A6i.equals(new C0861A6i(Boolean[].class))) {
                                i = 8;
                            } else if (c0861A6i.equals(new C0861A6i(Byte[].class))) {
                                i = 9;
                            } else if (c0861A6i.equals(new C0861A6i(Integer[].class))) {
                                i = 10;
                            } else if (c0861A6i.equals(new C0861A6i(Long[].class))) {
                                i = 11;
                            } else if (c0861A6i.equals(new C0861A6i(Float[].class))) {
                                i = 12;
                            } else if (c0861A6i.equals(new C0861A6i(Double[].class))) {
                                i = 13;
                            } else {
                                if (!c0861A6i.equals(new C0861A6i(String[].class))) {
                                    throw C60Q.A0U("Unsupported value type ", C0861A6i.A00(cls));
                                }
                                i = 14;
                            }
                            dataOutputStream.writeByte(i);
                            dataOutputStream.writeInt(objArr.length);
                            for (Object obj : objArr) {
                                if (i == 8) {
                                    dataOutputStream.writeBoolean((!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) ? false : bool.booleanValue());
                                } else if (i == 9) {
                                    dataOutputStream.writeByte((!(obj instanceof Byte) || (b = (Byte) obj) == null) ? (byte) 0 : b.byteValue());
                                } else if (i == 10) {
                                    dataOutputStream.writeInt((!(obj instanceof Integer) || (num = (Integer) obj) == null) ? 0 : num.intValue());
                                } else if (i == 11) {
                                    dataOutputStream.writeLong((!(obj instanceof Long) || (l = (Long) obj) == null) ? 0L : l.longValue());
                                } else if (i == 12) {
                                    dataOutputStream.writeFloat((!(obj instanceof Float) || (f = (Float) obj) == null) ? 0.0f : f.floatValue());
                                } else if (i == 13) {
                                    dataOutputStream.writeDouble((!(obj instanceof Double) || (d = (Double) obj) == null) ? 0.0d : d.doubleValue());
                                } else {
                                    if (!(obj instanceof String) || (str = (String) obj) == null) {
                                        str = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                                    }
                                    dataOutputStream.writeUTF(str);
                                }
                            }
                        }
                        dataOutputStream.writeUTF(str2);
                    }
                    dataOutputStream.writeByte(bByteValue);
                    dataOutputStream.writeUTF(str2);
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw C3cG.A0Q("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStreamA0F.toByteArray();
                dataOutputStream.close();
                C7384Etj.A0X(byteArray);
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            String str3 = BzC.A00;
            EK9.A00();
            Log.e(str3, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public final String A01(String str) {
        Object obj = this.A00.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 0;
        for (Map.Entry<String, Object> entry : this.A00.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                String key = entry.getKey();
                iHashCode = (key == null ? 0 : key.hashCode()) ^ Arrays.deepHashCode((Object[]) value);
            } else {
                iHashCode = entry.hashCode();
            }
            i += iHashCode;
        }
        return i * 31;
    }

    public final String toString() {
        return FGI.A0U("Data {", AbstractC06907md.A01(", ", this.A00.entrySet(), new C7588F5b(2)), "}");
    }

    static {
        BzB bzB = new BzB(C3cG.A0j());
        A00(bzB);
        A01 = bzB;
    }

    public BzB(BzB bzB) {
        this.A00 = BV4.A0w(bzB.A00);
    }

    public final boolean A02(String str) {
        Object objA0h = AnonymousClass001.A0h();
        Object obj = this.A00.get(str);
        if (obj instanceof Boolean) {
            objA0h = obj;
        }
        return AnonymousClass001.A1X(objA0h);
    }

    public BzB(Map<String, ?> map) {
        this.A00 = new HashMap(map);
    }
}
