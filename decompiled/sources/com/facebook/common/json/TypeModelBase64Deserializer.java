package com.facebook.common.json;

import X.AbstractC10521Hoo;
import X.AbstractC9779GgG;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV4;
import X.F60;
import android.util.Base64;
import com.facebook.flatbuffers.FlatBufferCorruptionException;
import com.facebook.graphservice.staticcontext.StaticGraphServiceFactory;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes6.dex */
public class TypeModelBase64Deserializer extends FbJsonDeserializer {
    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        int iPosition;
        try {
            String strA27 = abstractC9916Gl7.A27();
            if (strA27 == null) {
                return null;
            }
            if (!strA27.startsWith("fltb:")) {
                Preconditions.checkState(strA27.startsWith("tree:"));
                String strReplaceFirst = strA27.replaceFirst("tree:", "");
                AbstractC10521Hoo.A00(strReplaceFirst);
                if (strReplaceFirst.startsWith("type_tag:")) {
                    strReplaceFirst = strReplaceFirst.substring(18);
                }
                ByteBuffer.wrap(Base64.decode(strReplaceFirst, 2));
                StaticGraphServiceFactory.getTreeSerializer();
                throw null;
            }
            String strReplaceFirst2 = strA27.replaceFirst("fltb:", "");
            int iA00 = AbstractC10521Hoo.A00(strReplaceFirst2);
            if (strReplaceFirst2.startsWith("type_tag:")) {
                strReplaceFirst2 = strReplaceFirst2.substring(18);
            }
            try {
                this.A00.getDeclaredConstructor(Integer.TYPE, int[].class).newInstance(Integer.valueOf(iA00), null);
                ByteBuffer byteBufferDuplicate = ByteBuffer.wrap(Base64.decode(strReplaceFirst2, 2)).duplicate();
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferDuplicate.order(byteOrder);
                try {
                    byteBufferDuplicate.order(byteOrder);
                    synchronized (byteBufferDuplicate) {
                        iPosition = byteBufferDuplicate.position();
                    }
                    if (byteBufferDuplicate.getInt(iPosition) + iPosition <= 0) {
                        return null;
                    }
                    try {
                        throw BV4.A0a("initFromMutableFlatBuffer");
                    } catch (IndexOutOfBoundsException e) {
                        throw new FlatBufferCorruptionException("", e);
                    }
                } catch (Exception e2) {
                    throw new FlatBufferCorruptionException("", e2);
                }
            } catch (Exception e3) {
                throw BV4.A0d("Can't create model object", e3);
            }
        } catch (Exception e4) {
            Throwables.propagateIfPossible(e4, IOException.class);
            AbstractC9779GgG.A00(abstractC9916Gl7, this.A00, e4);
            throw F60.createAndThrow();
        }
    }
}
