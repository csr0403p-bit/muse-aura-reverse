package X;

import com.android.billingclient.v6;
import com.android.billingclient.wa;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class GI0 extends GIF {
    public static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    public static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    public static final Map<Class<?>, GI0> defaultInstanceMap = C60O.A1C();
    public int memoizedSerializedSize = -1;
    public GI4 b = GI4.A05;

    public static GI0 A00(GI0 gi0, byte[] bArr) throws Throwable {
        GI0 gi02 = gi0;
        int length = bArr.length;
        C10603HyJ.A00();
        if (length == 0) {
            if (gi0 != null) {
            }
            return gi02;
        }
        gi02 = (GI0) gi0.A0E(4);
        try {
            GIK gikA0Y = AbstractC7609F5w.A0Y(gi02);
            gikA0Y.A2p(new GIS(), gi02, bArr, 0, length);
            gikA0Y.A52(gi02);
        } catch (v6 e) {
            throw e;
        } catch (wa e2) {
            throw AbstractC7607F5u.A0q(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof v6) {
                throw e3.getCause();
            }
            throw new v6(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw AbstractC7607F5u.A0q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte bByteValue = ((Number) gi02.A0E(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                throw AbstractC7607F5u.A0q(new wa().getMessage());
            }
            AbstractC7609F5w.A0Y(gi02).A2m(gi02);
            gi02.A0E(2);
            throw F60.createAndThrow();
        }
        return gi02;
    }

    public final GIG A0D() {
        GIG gig = (GIG) A0E(5);
        GI0 gi0 = gig.A01;
        if (!gi0.getClass().isInstance(this)) {
            throw C60O.A0i("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        if (!gi0.equals(this)) {
            GI0 gi0A02 = GIG.A02(gig);
            AbstractC7609F5w.A0Y(gi0A02).A2j(gi0A02, this);
        }
        return gig;
    }

    public static void A02(GI0 gi0, Class cls) {
        gi0.memoizedSerializedSize &= Integer.MAX_VALUE;
        defaultInstanceMap.put(cls, gi0);
    }

    public final Object A0E(int i) {
        GIZ giv;
        GIZ giv2;
        GIZ giv3;
        GIZ giv4;
        GIZ giv5;
        GIZ giv6;
        GIZ giv7;
        GIZ giv8;
        GIZ giv9;
        GIZ giv10;
        GIZ giv11;
        GIZ giv12;
        GIZ giv13;
        GIZ giv14;
        GIZ giv15;
        GIZ giv16;
        GIZ giv17;
        GIZ giv18;
        GIZ giv19;
        GIZ giv20;
        GIZ giv21;
        GIZ giv22;
        GIZ giv23;
        GIZ giv24;
        GIZ giv25;
        if (this instanceof GO6) {
            int i2 = i - 1;
            if (i2 == 0) {
                return (byte) 1;
            }
            if (i2 == 2) {
                return new GIM(GO6.DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001", new Object[]{"bitField0_", "responseCode_", "debugMessage_"});
            }
            if (i2 == 3) {
                return new GO6();
            }
            if (i2 == 4) {
                return new C9553GOk();
            }
            if (i2 == 5) {
                return GO6.DEFAULT_INSTANCE;
            }
            if (i2 == 6) {
                GIZ giz = GO6.PARSER;
                if (giz != null) {
                    return giz;
                }
                synchronized (GO6.class) {
                    giv25 = GO6.PARSER;
                    if (giv25 == null) {
                        giv25 = new GIV();
                        GO6.PARSER = giv25;
                    }
                }
                return giv25;
            }
        } else if (this instanceof GNV) {
            int i3 = i - 1;
            if (i3 == 0) {
                return (byte) 1;
            }
            if (i3 == 2) {
                return new GIM(GNV.DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u180c\u0000", new Object[]{"bitField0_", "reason_", C9526GNd.A00});
            }
            if (i3 == 3) {
                return new GNV();
            }
            if (i3 == 4) {
                return new GNY();
            }
            if (i3 == 5) {
                return GNV.DEFAULT_INSTANCE;
            }
            if (i3 == 6) {
                GIZ giz2 = GNV.PARSER;
                if (giz2 != null) {
                    return giz2;
                }
                synchronized (GNV.class) {
                    giv24 = GNV.PARSER;
                    if (giv24 == null) {
                        giv24 = new GIV();
                        GNV.PARSER = giv24;
                    }
                }
                return giv24;
            }
        } else if (this instanceof C9417GIg) {
            int i4 = i - 1;
            if (i4 == 0) {
                return (byte) 1;
            }
            if (i4 == 2) {
                return new GIM(C9417GIg.DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002\u1004\u0000\u0003\u1008\u0001", new Object[]{"bitField0_", "productId_", "purchaseState_", "packageName_"});
            }
            if (i4 == 3) {
                return new C9417GIg();
            }
            if (i4 == 4) {
                return new C9418GIh();
            }
            if (i4 == 5) {
                return C9417GIg.DEFAULT_INSTANCE;
            }
            if (i4 == 6) {
                GIZ giz3 = C9417GIg.PARSER;
                if (giz3 != null) {
                    return giz3;
                }
                synchronized (C9417GIg.class) {
                    giv23 = C9417GIg.PARSER;
                    if (giv23 == null) {
                        giv23 = new GIV();
                        C9417GIg.PARSER = giv23;
                    }
                }
                return giv23;
            }
        } else if (this instanceof GJF) {
            int i5 = i - 1;
            if (i5 == 0) {
                return (byte) 1;
            }
            if (i5 == 2) {
                return new GIM(GJF.DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[]{"bitField0_", "shouldEnableLocalReceiver_", "shouldReceiveWithPermission_"});
            }
            if (i5 == 3) {
                return new GJF();
            }
            if (i5 == 4) {
                return new GJG();
            }
            if (i5 == 5) {
                return GJF.DEFAULT_INSTANCE;
            }
            if (i5 == 6) {
                GIZ giz4 = GJF.PARSER;
                if (giz4 != null) {
                    return giz4;
                }
                synchronized (GJF.class) {
                    giv22 = GJF.PARSER;
                    if (giv22 == null) {
                        giv22 = new GIV();
                        GJF.PARSER = giv22;
                    }
                }
                return giv22;
            }
        } else {
            if (this instanceof GJS) {
                int i6 = i - 1;
                if (i6 == 0) {
                    return (byte) 1;
                }
                if (i6 == 2) {
                    return new GIM(GJS.DEFAULT_INSTANCE, "\u0004\u0000", null);
                }
                if (i6 == 3) {
                    return new GJS();
                }
                if (i6 == 4) {
                    return new GJT();
                }
                if (i6 == 5) {
                    return GJS.DEFAULT_INSTANCE;
                }
                if (i6 != 6) {
                    throw null;
                }
                GIZ giz5 = GJS.PARSER;
                if (giz5 != null) {
                    return giz5;
                }
                synchronized (GJS.class) {
                    giv21 = GJS.PARSER;
                    if (giv21 == null) {
                        giv21 = new GIV();
                        GJS.PARSER = giv21;
                    }
                }
                return giv21;
            }
            if (this instanceof C9523GNa) {
                int i7 = i - 1;
                if (i7 == 0) {
                    return (byte) 1;
                }
                if (i7 == 2) {
                    return new GIM(C9523GNa.DEFAULT_INSTANCE, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0002\u0003\u1004\u0003\u0004\u1002\u0004\u0005\u1008\u0001\u0006\u1002\u0005\u0007\u1007\u0006\b\u1004\u0007\t\u1004\b\n\u1002\t\u000b\u1008\n\f\u1008\u000b\r\u1008\f\u000e\u1008\r\u000f\u1004\u000e", new Object[]{"bitField0_", "playBillingLibraryVersion_", "callingPackage_", "billingApiVersion_", "billingClientSessionId_", "playBillingLibraryWrapperVersion_", "billingClientTransactionId_", "isAutoServiceReconnectionEnabled_", "androidSdkVersion_", "appVersionCode_", "buildChangelist_", "deviceBrand_", "deviceModel_", "deviceManufacturer_", "deviceFingerprint_", "deviceRamInMb_"});
                }
                if (i7 == 3) {
                    return new C9523GNa();
                }
                if (i7 == 4) {
                    return new C9524GNb();
                }
                if (i7 == 5) {
                    return C9523GNa.DEFAULT_INSTANCE;
                }
                if (i7 == 6) {
                    GIZ giz6 = C9523GNa.PARSER;
                    if (giz6 != null) {
                        return giz6;
                    }
                    synchronized (C9523GNa.class) {
                        giv20 = C9523GNa.PARSER;
                        if (giv20 == null) {
                            giv20 = new GIV();
                            C9523GNa.PARSER = giv20;
                        }
                    }
                    return giv20;
                }
            } else if (this instanceof C9415GIe) {
                int i8 = i - 1;
                if (i8 == 0) {
                    return (byte) 1;
                }
                if (i8 == 2) {
                    return new GIM(C9415GIe.DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003\u023b\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", GIW.class, C9413GIc.class});
                }
                if (i8 == 3) {
                    return new C9415GIe();
                }
                if (i8 == 4) {
                    return new C9416GIf();
                }
                if (i8 == 5) {
                    return C9415GIe.DEFAULT_INSTANCE;
                }
                if (i8 == 6) {
                    GIZ giz7 = C9415GIe.PARSER;
                    if (giz7 != null) {
                        return giz7;
                    }
                    synchronized (C9415GIe.class) {
                        giv19 = C9415GIe.PARSER;
                        if (giv19 == null) {
                            giv19 = new GIV();
                            C9415GIe.PARSER = giv19;
                        }
                    }
                    return giv19;
                }
            } else if (this instanceof GO9) {
                int i9 = i - 1;
                if (i9 == 0) {
                    return (byte) 1;
                }
                if (i9 == 2) {
                    return new GIM(GO9.DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u180c\u0000", new Object[]{"bitField0_", "reason_", GP7.A00});
                }
                if (i9 == 3) {
                    return new GO9();
                }
                if (i9 == 4) {
                    return new C9552GOj();
                }
                if (i9 == 5) {
                    return GO9.DEFAULT_INSTANCE;
                }
                if (i9 == 6) {
                    GIZ giz8 = GO9.PARSER;
                    if (giz8 != null) {
                        return giz8;
                    }
                    synchronized (GO9.class) {
                        giv18 = GO9.PARSER;
                        if (giv18 == null) {
                            giv18 = new GIV();
                            GO9.PARSER = giv18;
                        }
                    }
                    return giv18;
                }
            } else if (this instanceof C9543GNz) {
                int i10 = i - 1;
                if (i10 == 0) {
                    return (byte) 1;
                }
                if (i10 == 2) {
                    return new GIM(C9543GNz.DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0004\u180c\u0002\u0005\u1008\u0003\u0007\u1004\u0004\b\u1004\u0005", new Object[]{"bitField0_", "responseCode_", "debugMessage_", "reason_", C9567GOy.A00, "additionalDetails_", "onPurchasesUpdatedSubResponseCode_", "initializeRetryAttemptCount_"});
                }
                if (i10 == 3) {
                    return new C9543GNz();
                }
                if (i10 == 4) {
                    return new C9528GNf();
                }
                if (i10 == 5) {
                    return C9543GNz.DEFAULT_INSTANCE;
                }
                if (i10 == 6) {
                    GIZ giz9 = C9543GNz.PARSER;
                    if (giz9 != null) {
                        return giz9;
                    }
                    synchronized (C9543GNz.class) {
                        giv17 = C9543GNz.PARSER;
                        if (giv17 == null) {
                            giv17 = new GIV();
                            C9543GNz.PARSER = giv17;
                        }
                    }
                    return giv17;
                }
            } else if (this instanceof C9542GNy) {
                int i11 = i - 1;
                if (i11 == 0) {
                    return (byte) 1;
                }
                if (i11 == 2) {
                    return new GIM(C9542GNy.DEFAULT_INSTANCE, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u180c\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005\u180c\u0001", new Object[]{"apiDetails_", "apiDetailsCase_", "bitField0_", "apiMethod_", GP6.A00, GO7.class, GO4.class, C9435GIz.class, "billingBroadcastAction_", C9425GIo.A00});
                }
                if (i11 == 3) {
                    return new C9542GNy();
                }
                if (i11 == 4) {
                    return new C9529GNg();
                }
                if (i11 == 5) {
                    return C9542GNy.DEFAULT_INSTANCE;
                }
                if (i11 == 6) {
                    GIZ giz10 = C9542GNy.PARSER;
                    if (giz10 != null) {
                        return giz10;
                    }
                    synchronized (C9542GNy.class) {
                        giv16 = C9542GNy.PARSER;
                        if (giv16 == null) {
                            giv16 = new GIV();
                            C9542GNy.PARSER = giv16;
                        }
                    }
                    return giv16;
                }
            } else if (this instanceof C9430GIu) {
                int i12 = i - 1;
                if (i12 == 0) {
                    return (byte) 1;
                }
                if (i12 == 2) {
                    return new GIM(C9430GIu.DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"subscriptionProductReplacementParams_", C9519GMm.class});
                }
                if (i12 == 3) {
                    return new C9430GIu();
                }
                if (i12 == 4) {
                    return new C9431GIv();
                }
                if (i12 == 5) {
                    return C9430GIu.DEFAULT_INSTANCE;
                }
                if (i12 == 6) {
                    GIZ giz11 = C9430GIu.PARSER;
                    if (giz11 != null) {
                        return giz11;
                    }
                    synchronized (C9430GIu.class) {
                        giv15 = C9430GIu.PARSER;
                        if (giv15 == null) {
                            giv15 = new GIV();
                            C9430GIu.PARSER = giv15;
                        }
                    }
                    return giv15;
                }
            } else if (this instanceof C9413GIc) {
                int i13 = i - 1;
                if (i13 == 0) {
                    return (byte) 1;
                }
                if (i13 == 2) {
                    return new GIM(C9413GIc.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", C9415GIe.class});
                }
                if (i13 == 3) {
                    return new C9413GIc();
                }
                if (i13 == 4) {
                    return new C9414GId();
                }
                if (i13 == 5) {
                    return C9413GIc.DEFAULT_INSTANCE;
                }
                if (i13 == 6) {
                    GIZ giz12 = C9413GIc.PARSER;
                    if (giz12 != null) {
                        return giz12;
                    }
                    synchronized (C9413GIc.class) {
                        giv14 = C9413GIc.PARSER;
                        if (giv14 == null) {
                            giv14 = new GIV();
                            C9413GIc.PARSER = giv14;
                        }
                    }
                    return giv14;
                }
            } else if (this instanceof C9519GMm) {
                int i14 = i - 1;
                if (i14 == 0) {
                    return (byte) 1;
                }
                if (i14 == 2) {
                    return new GIM(C9519GMm.DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u180c\u0002", new Object[]{"bitField0_", "newItemId_", "oldItemId_", "replacementMode_", C9521GMo.A00});
                }
                if (i14 == 3) {
                    return new C9519GMm();
                }
                if (i14 == 4) {
                    return new C9520GMn();
                }
                if (i14 == 5) {
                    return C9519GMm.DEFAULT_INSTANCE;
                }
                if (i14 == 6) {
                    GIZ giz13 = C9519GMm.PARSER;
                    if (giz13 != null) {
                        return giz13;
                    }
                    synchronized (C9519GMm.class) {
                        giv13 = C9519GMm.PARSER;
                        if (giv13 == null) {
                            giv13 = new GIV();
                            C9519GMm.PARSER = giv13;
                        }
                    }
                    return giv13;
                }
            } else if (this instanceof GO5) {
                int i15 = i - 1;
                if (i15 == 0) {
                    return (byte) 1;
                }
                if (i15 == 2) {
                    return new GIM(GO5.DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001", new Object[]{"bitField0_", "billingResultDetails_", "connectionEstablishmentDurationMs_"});
                }
                if (i15 == 3) {
                    return new GO5();
                }
                if (i15 == 4) {
                    return new GOi();
                }
                if (i15 == 5) {
                    return GO5.DEFAULT_INSTANCE;
                }
                if (i15 == 6) {
                    GIZ giz14 = GO5.PARSER;
                    if (giz14 != null) {
                        return giz14;
                    }
                    synchronized (GO5.class) {
                        giv12 = GO5.PARSER;
                        if (giv12 == null) {
                            giv12 = new GIV();
                            GO5.PARSER = giv12;
                        }
                    }
                    return giv12;
                }
            } else if (this instanceof C9541GNx) {
                int i16 = i - 1;
                if (i16 == 0) {
                    return (byte) 1;
                }
                if (i16 == 2) {
                    return new GIM(C9541GNx.DEFAULT_INSTANCE, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001\u0004<\u0000\u0005\u180c\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"apiDetails_", "apiDetailsCase_", "bitField0_", "apiMethod_", GP6.A00, "billingResultDetails_", GO7.class, "billingBroadcastAction_", C9425GIo.A00, GO4.class, C9435GIz.class});
                }
                if (i16 == 3) {
                    return new C9541GNx();
                }
                if (i16 == 4) {
                    return new GOC();
                }
                if (i16 == 5) {
                    return C9541GNx.DEFAULT_INSTANCE;
                }
                if (i16 == 6) {
                    GIZ giz15 = C9541GNx.PARSER;
                    if (giz15 != null) {
                        return giz15;
                    }
                    synchronized (C9541GNx.class) {
                        giv11 = C9541GNx.PARSER;
                        if (giv11 == null) {
                            giv11 = new GIV();
                            C9541GNx.PARSER = giv11;
                        }
                    }
                    return giv11;
                }
            } else if (this instanceof GNU) {
                int i17 = i - 1;
                if (i17 == 0) {
                    return (byte) 1;
                }
                if (i17 == 2) {
                    return new GIM(GNU.DEFAULT_INSTANCE, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1009\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\u1009\u0001\u0007<\u0000\b<\u0000", new Object[]{"event_", "eventCase_", "bitField0_", "clientMetaInfo_", C9541GNx.class, C9542GNy.class, GO9.class, C9423GIm.class, "flagState_", GJS.class, GO5.class});
                }
                if (i17 == 3) {
                    return new GNU();
                }
                if (i17 == 4) {
                    return new GNX();
                }
                if (i17 == 5) {
                    return GNU.DEFAULT_INSTANCE;
                }
                if (i17 == 6) {
                    GIZ giz16 = GNU.PARSER;
                    if (giz16 != null) {
                        return giz16;
                    }
                    synchronized (GNU.class) {
                        giv10 = GNU.PARSER;
                        if (giv10 == null) {
                            giv10 = new GIV();
                            GNU.PARSER = giv10;
                        }
                    }
                    return giv10;
                }
            } else if (this instanceof C9435GIz) {
                int i18 = i - 1;
                if (i18 == 0) {
                    return (byte) 1;
                }
                if (i18 == 2) {
                    return new GIM(C9435GIz.DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1007\u0001", new Object[]{"bitField0_", "purchaseExtractionResults_", C9433GIx.class, "additionalDetails_", "wasServiceAutoReconnected_"});
                }
                if (i18 == 3) {
                    return new C9435GIz();
                }
                if (i18 == 4) {
                    return new GJ0();
                }
                if (i18 == 5) {
                    return C9435GIz.DEFAULT_INSTANCE;
                }
                if (i18 == 6) {
                    GIZ giz17 = C9435GIz.PARSER;
                    if (giz17 != null) {
                        return giz17;
                    }
                    synchronized (C9435GIz.class) {
                        giv9 = C9435GIz.PARSER;
                        if (giv9 == null) {
                            giv9 = new GIV();
                            C9435GIz.PARSER = giv9;
                        }
                    }
                    return giv9;
                }
            } else if (this instanceof C9433GIx) {
                int i19 = i - 1;
                if (i19 == 0) {
                    return (byte) 1;
                }
                if (i19 == 2) {
                    return new GIM(C9433GIx.DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001", new Object[]{"bitField0_", "status_", C9412GIb.A00, "additionalDetails_"});
                }
                if (i19 == 3) {
                    return new C9433GIx();
                }
                if (i19 == 4) {
                    return new C9434GIy();
                }
                if (i19 == 5) {
                    return C9433GIx.DEFAULT_INSTANCE;
                }
                if (i19 == 6) {
                    GIZ giz18 = C9433GIx.PARSER;
                    if (giz18 != null) {
                        return giz18;
                    }
                    synchronized (C9433GIx.class) {
                        giv8 = C9433GIx.PARSER;
                        if (giv8 == null) {
                            giv8 = new GIV();
                            C9433GIx.PARSER = giv8;
                        }
                    }
                    return giv8;
                }
            } else if (this instanceof GIW) {
                int i20 = i - 1;
                if (i20 == 0) {
                    return (byte) 1;
                }
                if (i20 == 2) {
                    return new GIM(GIW.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", GIP.A00});
                }
                if (i20 == 3) {
                    return new GIW();
                }
                if (i20 == 4) {
                    return new GIX();
                }
                if (i20 == 5) {
                    return GIW.DEFAULT_INSTANCE;
                }
                if (i20 == 6) {
                    GIZ giz19 = GIW.PARSER;
                    if (giz19 != null) {
                        return giz19;
                    }
                    synchronized (GIW.class) {
                        giv7 = GIW.PARSER;
                        if (giv7 == null) {
                            giv7 = new GIV();
                            GIW.PARSER = giv7;
                        }
                    }
                    return giv7;
                }
            } else if (this instanceof GMZ) {
                int i21 = i - 1;
                if (i21 == 0) {
                    return (byte) 1;
                }
                if (i21 == 2) {
                    return new GIM(GMZ.DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[]{"bitField0_", "id_"});
                }
                if (i21 == 3) {
                    return new GMZ();
                }
                if (i21 == 4) {
                    return new C9509GMa();
                }
                if (i21 == 5) {
                    return GMZ.DEFAULT_INSTANCE;
                }
                if (i21 == 6) {
                    GIZ giz20 = GMZ.PARSER;
                    if (giz20 != null) {
                        return giz20;
                    }
                    synchronized (GMZ.class) {
                        giv6 = GMZ.PARSER;
                        if (giv6 == null) {
                            giv6 = new GIV();
                            GMZ.PARSER = giv6;
                        }
                    }
                    return giv6;
                }
            } else if (this instanceof GMX) {
                int i22 = i - 1;
                if (i22 == 0) {
                    return (byte) 1;
                }
                if (i22 == 2) {
                    return new GIM(GMX.DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[]{"bitField0_", "countryCode_"});
                }
                if (i22 == 3) {
                    return new GMX();
                }
                if (i22 == 4) {
                    return new GMY();
                }
                if (i22 == 5) {
                    return GMX.DEFAULT_INSTANCE;
                }
                if (i22 == 6) {
                    GIZ giz21 = GMX.PARSER;
                    if (giz21 != null) {
                        return giz21;
                    }
                    synchronized (GMX.class) {
                        giv5 = GMX.PARSER;
                        if (giv5 == null) {
                            giv5 = new GIV();
                            GMX.PARSER = giv5;
                        }
                    }
                    return giv5;
                }
            } else if (this instanceof GO7) {
                int i23 = i - 1;
                if (i23 == 0) {
                    return (byte) 1;
                }
                if (i23 == 2) {
                    return new GIM(GO7.DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u180c\u0000", new Object[]{"bitField0_", "featureType_", GP8.A00});
                }
                if (i23 == 3) {
                    return new GO7();
                }
                if (i23 == 4) {
                    return new C9554GOl();
                }
                if (i23 == 5) {
                    return GO7.DEFAULT_INSTANCE;
                }
                if (i23 == 6) {
                    GIZ giz22 = GO7.PARSER;
                    if (giz22 != null) {
                        return giz22;
                    }
                    synchronized (GO7.class) {
                        giv4 = GO7.PARSER;
                        if (giv4 == null) {
                            giv4 = new GIV();
                            GO7.PARSER = giv4;
                        }
                    }
                    return giv4;
                }
            } else if (this instanceof GO4) {
                int i24 = i - 1;
                if (i24 == 0) {
                    return (byte) 1;
                }
                if (i24 == 2) {
                    return new GIM(GO4.DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1007\u0001\u0003\u1002\u0002\u0004\u1007\u0003\u0005\u1004\u0004\u0006\u1004\u0005", new Object[]{"bitField0_", "billingApiVersion_", "isConnectionAlreadyEstablished_", "connectionEstablishmentDurationMs_", "autoServiceReconnectionAttempt_", "autoServiceReconnectionAttemptCount_", "initializeRetryAttemptCount_"});
                }
                if (i24 == 3) {
                    return new GO4();
                }
                if (i24 == 4) {
                    return new C9556GOn();
                }
                if (i24 == 5) {
                    return GO4.DEFAULT_INSTANCE;
                }
                if (i24 == 6) {
                    GIZ giz23 = GO4.PARSER;
                    if (giz23 != null) {
                        return giz23;
                    }
                    synchronized (GO4.class) {
                        giv3 = GO4.PARSER;
                        if (giv3 == null) {
                            giv3 = new GIV();
                            GO4.PARSER = giv3;
                        }
                    }
                    return giv3;
                }
            } else {
                int i25 = i - 1;
                if (this instanceof GO1) {
                    if (i25 == 0) {
                        return (byte) 1;
                    }
                    if (i25 == 2) {
                        return new GIM(GO1.DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005", new Object[]{"bitField0_", "requiredBillingVersion_", "supportedBillingVersion_", "appVersion_", "playBillingLibraryVersion_", "callingPackage_", "playBillingLibraryMethod_"});
                    }
                    if (i25 == 3) {
                        return new GO1();
                    }
                    if (i25 == 4) {
                        return new C9555GOm();
                    }
                    if (i25 == 5) {
                        return GO1.DEFAULT_INSTANCE;
                    }
                    if (i25 == 6) {
                        GIZ giz24 = GO1.PARSER;
                        if (giz24 != null) {
                            return giz24;
                        }
                        synchronized (GO1.class) {
                            giv2 = GO1.PARSER;
                            if (giv2 == null) {
                                giv2 = new GIV();
                                GO1.PARSER = giv2;
                            }
                        }
                        return giv2;
                    }
                } else {
                    if (i25 == 0) {
                        return (byte) 1;
                    }
                    if (i25 == 2) {
                        return new GIM(C9423GIm.DEFAULT_INSTANCE, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u082c\u0004\u001b\u0005\u1009\u0002\u0006\u1007\u0003\u0007\u1007\u0004\b\u1009\u0005", new Object[]{"bitField0_", "details_", "receiverEvent_", C9426GIp.A00, "broadcastAction_", C9425GIo.A00, "purchase_", C9417GIg.class, "billingResultDetails_", "phoneskyHasRequiredPermission_", "receiverRegisteredWithPermission_", "registerFailure_"});
                    }
                    if (i25 == 3) {
                        return new C9423GIm();
                    }
                    if (i25 == 4) {
                        return new C9424GIn();
                    }
                    if (i25 == 5) {
                        return C9423GIm.DEFAULT_INSTANCE;
                    }
                    if (i25 == 6) {
                        GIZ giz25 = C9423GIm.PARSER;
                        if (giz25 != null) {
                            return giz25;
                        }
                        synchronized (C9423GIm.class) {
                            giv = C9423GIm.PARSER;
                            if (giv == null) {
                                giv = new GIV();
                                C9423GIm.PARSER = giv;
                            }
                        }
                        return giv;
                    }
                }
            }
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return GIL.A02.A00(cls).A2l(this, (GI0) obj);
    }

    public final int hashCode() {
        if (AbstractC7609F5w.A1U(this.memoizedSerializedSize, Integer.MIN_VALUE)) {
            return AbstractC7609F5w.A0Y(this).A2g(this);
        }
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int iA2g = AbstractC7609F5w.A0Y(this).A2g(this);
        this.a = iA2g;
        return iA2g;
    }

    public static Object A01(GIF gif, Method method, Object... objArr) throws Throwable {
        try {
            return method.invoke(gif, objArr);
        } catch (IllegalAccessException e) {
            throw BV4.A0d("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw BV4.A0d("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final void A0F() {
        AbstractC7609F5w.A0Y(this).A52(this);
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final void A0G(GI5 gi5) {
        GIK gikA0Y = AbstractC7609F5w.A0Y(this);
        GIQ giq = gi5.A01;
        if (giq == null) {
            giq = new GIQ(gi5);
        }
        gikA0Y.A2o(giq, this);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = GEm.A00;
        StringBuilder sbA13 = AbstractC7610F5x.A13(string);
        GEm.A00(this, sbA13, 0);
        return sbA13.toString();
    }
}
