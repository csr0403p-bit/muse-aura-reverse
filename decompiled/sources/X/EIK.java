package X;

import android.net.NetworkRequest;
import android.net.Uri;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public interface EIK extends AutoCloseable {
    static void A09(EIK eik, String str, String str2) {
        eik.A5F(1, str);
        eik.A5F(2, str2);
    }

    static void A0A(EIK eik, AbstractCollection abstractCollection) {
        abstractCollection.add(eik.ALa(0));
    }

    void A5A(int i, byte[] bArr);

    void A5B(int i, double d);

    void A5C(int i, long j);

    void A5D(int i);

    void A5F(int i, String str);

    void A6F();

    boolean ACx(int i);

    String ALa(int i);

    boolean AgN();

    @Override // java.lang.AutoCloseable
    void close();

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    boolean isNull(int i);

    void reset();

    static int A00(EIK eik, int i) {
        return (int) eik.getLong(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Long[]] */
    static BzB A01(EIK eik, int i) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        boolean z;
        int i2;
        ?? dataInputStream;
        Serializable utf;
        byte[] blob = eik.getBlob(i);
        BzB bzB = BzB.A01;
        C7384Etj.A0Y(blob, 0);
        int length = blob.length;
        if (length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (length == 0) {
            return BzB.A01;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            byteArrayInputStream = new ByteArrayInputStream(blob);
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            z = false;
            if (bArr[0] == -84 && bArr[1] == -19) {
                z = true;
            }
            byteArrayInputStream.reset();
            i2 = 0;
        } catch (IOException | ClassNotFoundException e) {
            String str = BzC.A00;
            EK9.A00();
            Log.e(str, "Error in Data#fromByteArray: ", e);
        }
        try {
            if (z) {
                dataInputStream = new ObjectInputStream(byteArrayInputStream);
                int i3 = dataInputStream.readInt();
                while (i2 < i3) {
                    linkedHashMap.put(dataInputStream.readUTF(), dataInputStream.readObject());
                    i2++;
                }
            } else {
                dataInputStream = new DataInputStream(byteArrayInputStream);
                short s = dataInputStream.readShort();
                if (s != -21521) {
                    throw new IllegalStateException(FGI.A0H("Magic number doesn't match: ", s));
                }
                short s2 = dataInputStream.readShort();
                if (s2 != 1) {
                    throw new IllegalStateException(FGI.A0H("Unsupported version number: ", s2));
                }
                int i4 = dataInputStream.readInt();
                while (i2 < i4) {
                    byte b = dataInputStream.readByte();
                    Serializable serializable = null;
                    if (b != 0) {
                        if (b == 1) {
                            utf = Boolean.valueOf(dataInputStream.readBoolean());
                        } else if (b == 2) {
                            utf = Byte.valueOf(dataInputStream.readByte());
                        } else if (b == 3) {
                            utf = Integer.valueOf(dataInputStream.readInt());
                        } else if (b == 4) {
                            utf = Long.valueOf(dataInputStream.readLong());
                        } else if (b == 5) {
                            utf = Float.valueOf(dataInputStream.readFloat());
                        } else if (b == 6) {
                            utf = Double.valueOf(dataInputStream.readDouble());
                        } else if (b == 7) {
                            utf = dataInputStream.readUTF();
                        } else {
                            int i5 = 0;
                            if (b == 8) {
                                int i6 = dataInputStream.readInt();
                                ?? r7 = new Boolean[i6];
                                while (i5 < i6) {
                                    r7[i5] = Boolean.valueOf(dataInputStream.readBoolean());
                                    i5++;
                                }
                                serializable = (Serializable) r7;
                            } else if (b == 9) {
                                int i7 = dataInputStream.readInt();
                                ?? r72 = new Byte[i7];
                                while (i5 < i7) {
                                    r72[i5] = Byte.valueOf(dataInputStream.readByte());
                                    i5++;
                                }
                                serializable = (Serializable) r72;
                            } else if (b == 10) {
                                int i8 = dataInputStream.readInt();
                                ?? r73 = new Integer[i8];
                                while (i5 < i8) {
                                    r73[i5] = Integer.valueOf(dataInputStream.readInt());
                                    i5++;
                                }
                                serializable = (Serializable) r73;
                            } else if (b == 11) {
                                int i9 = dataInputStream.readInt();
                                ?? r74 = new Long[i9];
                                while (i5 < i9) {
                                    r74[i5] = Long.valueOf(dataInputStream.readLong());
                                    i5++;
                                }
                                serializable = (Serializable) r74;
                            } else if (b == 12) {
                                int i10 = dataInputStream.readInt();
                                ?? r75 = new Float[i10];
                                while (i5 < i10) {
                                    r75[i5] = Float.valueOf(dataInputStream.readFloat());
                                    i5++;
                                }
                                serializable = (Serializable) r75;
                            } else if (b == 13) {
                                int i11 = dataInputStream.readInt();
                                ?? r76 = new Double[i11];
                                while (i5 < i11) {
                                    r76[i5] = Double.valueOf(dataInputStream.readDouble());
                                    i5++;
                                }
                                serializable = (Serializable) r76;
                            } else {
                                if (b != 14) {
                                    throw new IllegalStateException(FGI.A0H("Unsupported type ", b));
                                }
                                int i12 = dataInputStream.readInt();
                                ?? r5 = new String[i12];
                                while (i5 < i12) {
                                    String utf2 = dataInputStream.readUTF();
                                    if ("androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d".equals(utf2)) {
                                        utf2 = null;
                                    }
                                    r5[i5] = utf2;
                                    i5++;
                                }
                                serializable = (Serializable) r5;
                            }
                        }
                        serializable = utf;
                    }
                    linkedHashMap.put(dataInputStream.readUTF(), serializable);
                    i2++;
                }
            }
            dataInputStream.close();
            return new BzB(linkedHashMap);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7531Ezs.A00(-84, th);
                throw th2;
            }
        }
    }

    static EnumC6619EKm A02(EIK eik, int i) {
        int i2 = (int) eik.getLong(i);
        if (i2 == 0) {
            return EnumC6619EKm.A04;
        }
        if (i2 == 1) {
            return EnumC6619EKm.A06;
        }
        if (i2 == 2) {
            return EnumC6619EKm.A07;
        }
        if (i2 == 3) {
            return EnumC6619EKm.A05;
        }
        if (i2 == 4) {
            return EnumC6619EKm.A02;
        }
        if (i2 == 5) {
            return EnumC6619EKm.A03;
        }
        throw new IllegalArgumentException(FGI.A0I("Could not convert ", i2, " to State"));
    }

    static C7417EvK A03(EIK eik, int i) throws IOException {
        byte[] blob = eik.getBlob(i);
        C7384Etj.A0Y(blob, 0);
        if (blob.length == 0) {
            return new C7417EvK(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i2 = objectInputStream.readInt();
                int[] iArr = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = objectInputStream.readInt();
                }
                int i4 = objectInputStream.readInt();
                int[] iArr2 = new int[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    iArr2[i5] = objectInputStream.readInt();
                }
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                for (int i6 = 0; i6 < i4; i6++) {
                    int i7 = iArr2[i6];
                    try {
                        builder.addCapability(i7);
                    } catch (IllegalArgumentException e) {
                        EK9.A00();
                        Log.w(C7417EvK.A01, FGI.A0I("Ignoring adding capability '", i7, "'"), e);
                    }
                }
                int[] iArr3 = EL1.A00;
                int i8 = 0;
                do {
                    int i9 = iArr3[i8];
                    if (!BFI.A0L(iArr2, i9)) {
                        try {
                            builder.removeCapability(i9);
                        } catch (IllegalArgumentException e2) {
                            EK9.A00();
                            Log.w(C7417EvK.A01, FGI.A0I("Ignoring removing default capability '", i9, "'"), e2);
                        }
                    }
                    i8++;
                } while (i8 < 3);
                for (int i10 = 0; i10 < i2; i10++) {
                    builder.addTransportType(iArr[i10]);
                }
                NetworkRequest networkRequestBuild = builder.build();
                C7384Etj.A0U(networkRequestBuild);
                C7417EvK c7417EvK = new C7417EvK(networkRequestBuild);
                objectInputStream.close();
                byteArrayInputStream.close();
                return c7417EvK;
            } finally {
            }
        } finally {
        }
    }

    static Integer A04(EJV ejv, EIK eik, String str, int i) {
        eik.A5F(i, str);
        eik.AgN();
        int iA00 = EJZ.A00(ejv);
        eik.close();
        return Integer.valueOf(iA00);
    }

    static Integer A05(EIK eik, int i) {
        return Integer.valueOf((int) eik.getLong(i));
    }

    static Integer A06(EIK eik, int i) {
        return EKH.A01((int) eik.getLong(i));
    }

    static Integer A07(EIK eik, int i) {
        int i2 = (int) eik.getLong(i);
        if (i2 == 0) {
            return C79.A00;
        }
        if (i2 == 1) {
            return C79.A01;
        }
        throw new IllegalArgumentException(FGI.A0I("Could not convert ", i2, " to BackoffPolicy"));
    }

    static LinkedHashSet A08(EIK eik, int i) throws IOException {
        ObjectInputStream objectInputStream;
        byte[] blob = eik.getBlob(i);
        C7384Etj.A0Y(blob, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (blob.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                int i2 = objectInputStream.readInt();
                for (int i3 = 0; i3 < i2; i3++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean z = objectInputStream.readBoolean();
                    C7384Etj.A0X(uri);
                    linkedHashSet.add(new ELN(z, uri));
                }
                objectInputStream.close();
                byteArrayInputStream.close();
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }
}
