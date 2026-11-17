package com.sun.jna;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV4;
import X.BV6;
import X.C3cG;
import X.FGI;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class ELFAnalyser {
    public static final int EF_ARM_ABI_FLOAT_HARD = 1024;
    public static final int EF_ARM_ABI_FLOAT_SOFT = 512;
    public static final int EI_CLASS_64BIT = 2;
    public static final int EI_DATA_BIG_ENDIAN = 2;
    public static final byte[] ELF_MAGIC = {Byte.MAX_VALUE, 69, 76, 70};
    public static final int E_MACHINE_ARM = 40;
    public static final int SHN_UNDEF = 0;
    public static final int SHN_XINDEX = 65535;
    public final String filename;
    public boolean ELF = false;
    public boolean _64Bit = false;
    public boolean bigEndian = false;
    public boolean armHardFloatFlag = false;
    public boolean armSoftFloatFlag = false;
    public boolean armEabiAapcsVfp = false;
    public boolean arm = false;

    public class ArmAeabiAttributesTag {
        public static final ArmAeabiAttributesTag ABI_FP_16bit_format;
        public static final ArmAeabiAttributesTag ABI_FP_denormal;
        public static final ArmAeabiAttributesTag ABI_FP_exceptions;
        public static final ArmAeabiAttributesTag ABI_FP_number_model;
        public static final ArmAeabiAttributesTag ABI_FP_optimization_goals;
        public static final ArmAeabiAttributesTag ABI_FP_rounding;
        public static final ArmAeabiAttributesTag ABI_FP_user_exceptions;
        public static final ArmAeabiAttributesTag ABI_HardFP_use;
        public static final ArmAeabiAttributesTag ABI_PCS_GOT_use;
        public static final ArmAeabiAttributesTag ABI_PCS_R9_use;
        public static final ArmAeabiAttributesTag ABI_PCS_RO_data;
        public static final ArmAeabiAttributesTag ABI_PCS_RW_data;
        public static final ArmAeabiAttributesTag ABI_PCS_wchar_t;
        public static final ArmAeabiAttributesTag ABI_VFP_args;
        public static final ArmAeabiAttributesTag ABI_WMMX_args;
        public static final ArmAeabiAttributesTag ABI_align8_preserved;
        public static final ArmAeabiAttributesTag ABI_align_needed;
        public static final ArmAeabiAttributesTag ABI_enum_size;
        public static final ArmAeabiAttributesTag ABI_optimization_goals;
        public static final ArmAeabiAttributesTag ARM_ISA_use;
        public static final ArmAeabiAttributesTag Advanced_SIMD_arch;
        public static final ArmAeabiAttributesTag CPU_arch;
        public static final ArmAeabiAttributesTag CPU_arch_profile;
        public static final ArmAeabiAttributesTag CPU_name;
        public static final ArmAeabiAttributesTag CPU_raw_name;
        public static final ArmAeabiAttributesTag CPU_unaligned_access;
        public static final ArmAeabiAttributesTag DIV_use;
        public static final ArmAeabiAttributesTag FP_HP_extension;
        public static final ArmAeabiAttributesTag FP_arch;
        public static final ArmAeabiAttributesTag File;
        public static final ArmAeabiAttributesTag MPextension_use;
        public static final ArmAeabiAttributesTag MPextension_use2;
        public static final ArmAeabiAttributesTag PCS_config;
        public static final ArmAeabiAttributesTag Section;
        public static final ArmAeabiAttributesTag Symbol;
        public static final ArmAeabiAttributesTag T2EE_use;
        public static final ArmAeabiAttributesTag THUMB_ISA_use;
        public static final ArmAeabiAttributesTag Virtualization_use;
        public static final ArmAeabiAttributesTag WMMX_arch;
        public static final ArmAeabiAttributesTag also_compatible_with;
        public static final ArmAeabiAttributesTag compatibility;
        public static final ArmAeabiAttributesTag conformance;
        public static final ArmAeabiAttributesTag nodefaults;
        public final String name;
        public final ParameterType parameterType;
        public final int value;
        public static final List<ArmAeabiAttributesTag> tags = BV4.A0y();
        public static final Map<Integer, ArmAeabiAttributesTag> valueMap = BV4.A0u();
        public static final Map<String, ArmAeabiAttributesTag> nameMap = BV4.A0u();

        public enum ParameterType {
            UINT32,
            NTBS,
            ULEB128
        }

        public boolean equals(Object obj) {
            return this == obj || (obj != null && getClass() == obj.getClass() && this.value == ((ArmAeabiAttributesTag) obj).value);
        }

        public static ArmAeabiAttributesTag addTag(int i, String str, ParameterType parameterType) {
            ArmAeabiAttributesTag armAeabiAttributesTag = new ArmAeabiAttributesTag(i, str, parameterType);
            Map<Integer, ArmAeabiAttributesTag> map = valueMap;
            if (!map.containsKey(Integer.valueOf(armAeabiAttributesTag.value))) {
                map.put(Integer.valueOf(armAeabiAttributesTag.value), armAeabiAttributesTag);
            }
            Map<String, ArmAeabiAttributesTag> map2 = nameMap;
            if (!map2.containsKey(armAeabiAttributesTag.name)) {
                map2.put(armAeabiAttributesTag.name, armAeabiAttributesTag);
            }
            tags.add(armAeabiAttributesTag);
            return armAeabiAttributesTag;
        }

        public static ArmAeabiAttributesTag getByName(String str) {
            return nameMap.get(str);
        }

        public static ArmAeabiAttributesTag getByValue(int i) {
            Map<Integer, ArmAeabiAttributesTag> map = valueMap;
            Integer numValueOf = Integer.valueOf(i);
            return map.containsKey(numValueOf) ? map.get(numValueOf) : new ArmAeabiAttributesTag(i, FGI.A0H("Unknown ", i), getParameterType(i));
        }

        public static List<ArmAeabiAttributesTag> getTags() {
            return Collections.unmodifiableList(tags);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        public int hashCode() {
            return 469 + this.value;
        }

        public String toString() {
            return FGI.A0X(this.name, " (", ")", this.value);
        }

        static {
            ParameterType parameterType = ParameterType.UINT32;
            File = addTag(1, "File", parameterType);
            Section = addTag(2, "Section", parameterType);
            Symbol = addTag(3, "Symbol", parameterType);
            ParameterType parameterType2 = ParameterType.NTBS;
            CPU_raw_name = addTag(4, "CPU_raw_name", parameterType2);
            CPU_name = addTag(5, "CPU_name", parameterType2);
            ParameterType parameterType3 = ParameterType.ULEB128;
            CPU_arch = addTag(6, "CPU_arch", parameterType3);
            CPU_arch_profile = addTag(7, "CPU_arch_profile", parameterType3);
            ARM_ISA_use = addTag(8, "ARM_ISA_use", parameterType3);
            THUMB_ISA_use = addTag(9, "THUMB_ISA_use", parameterType3);
            FP_arch = addTag(10, "FP_arch", parameterType3);
            WMMX_arch = addTag(11, "WMMX_arch", parameterType3);
            Advanced_SIMD_arch = addTag(12, "Advanced_SIMD_arch", parameterType3);
            PCS_config = addTag(13, "PCS_config", parameterType3);
            ABI_PCS_R9_use = addTag(14, "ABI_PCS_R9_use", parameterType3);
            ABI_PCS_RW_data = addTag(15, "ABI_PCS_RW_data", parameterType3);
            ABI_PCS_RO_data = addTag(16, "ABI_PCS_RO_data", parameterType3);
            ABI_PCS_GOT_use = addTag(17, "ABI_PCS_GOT_use", parameterType3);
            ABI_PCS_wchar_t = addTag(18, "ABI_PCS_wchar_t", parameterType3);
            ABI_FP_rounding = addTag(19, "ABI_FP_rounding", parameterType3);
            ABI_FP_denormal = addTag(20, "ABI_FP_denormal", parameterType3);
            ABI_FP_exceptions = addTag(21, "ABI_FP_exceptions", parameterType3);
            ABI_FP_user_exceptions = addTag(22, "ABI_FP_user_exceptions", parameterType3);
            ABI_FP_number_model = addTag(23, "ABI_FP_number_model", parameterType3);
            ABI_align_needed = addTag(24, "ABI_align_needed", parameterType3);
            ABI_align8_preserved = addTag(25, "ABI_align8_preserved", parameterType3);
            ABI_enum_size = addTag(26, "ABI_enum_size", parameterType3);
            ABI_HardFP_use = addTag(27, "ABI_HardFP_use", parameterType3);
            ABI_VFP_args = addTag(28, "ABI_VFP_args", parameterType3);
            ABI_WMMX_args = addTag(29, "ABI_WMMX_args", parameterType3);
            ABI_optimization_goals = addTag(30, "ABI_optimization_goals", parameterType3);
            ABI_FP_optimization_goals = addTag(31, "ABI_FP_optimization_goals", parameterType3);
            compatibility = addTag(32, "compatibility", ParameterType.NTBS);
            ParameterType parameterType4 = ParameterType.ULEB128;
            CPU_unaligned_access = addTag(34, "CPU_unaligned_access", parameterType4);
            FP_HP_extension = addTag(36, "FP_HP_extension", parameterType4);
            ABI_FP_16bit_format = addTag(38, "ABI_FP_16bit_format", parameterType4);
            ParameterType parameterType5 = ParameterType.ULEB128;
            MPextension_use = addTag(42, "MPextension_use", parameterType4);
            DIV_use = addTag(44, "DIV_use", parameterType4);
            nodefaults = addTag(64, "nodefaults", parameterType4);
            ParameterType parameterType6 = ParameterType.NTBS;
            also_compatible_with = addTag(65, "also_compatible_with", parameterType6);
            conformance = addTag(67, "conformance", parameterType6);
            ParameterType parameterType7 = ParameterType.ULEB128;
            T2EE_use = addTag(66, "T2EE_use", parameterType7);
            Virtualization_use = addTag(68, "Virtualization_use", parameterType7);
            MPextension_use2 = addTag(70, "MPextension_use", parameterType7);
        }

        public ArmAeabiAttributesTag(int i, String str, ParameterType parameterType) {
            this.value = i;
            this.name = str;
            this.parameterType = parameterType;
        }

        public static ParameterType getParameterType(int i) {
            ArmAeabiAttributesTag byValue = getByValue(i);
            return byValue == null ? i % 2 == 0 ? ParameterType.ULEB128 : ParameterType.NTBS : byValue.parameterType;
        }

        public ParameterType getParameterType() {
            return this.parameterType;
        }
    }

    public class ELFSectionHeaderEntry {
        public final long addr;
        public final long flags;
        public final int link;
        public String name;
        public final int nameOffset;
        public final long offset;
        public final long size;
        public final int type;

        public long getAddr() {
            return this.addr;
        }

        public long getFlags() {
            return this.flags;
        }

        public int getLink() {
            return this.link;
        }

        public String getName() {
            return this.name;
        }

        public int getNameOffset() {
            return this.nameOffset;
        }

        public long getOffset() {
            return this.offset;
        }

        public long getSize() {
            return this.size;
        }

        public int getType() {
            return this.type;
        }

        public String toString() {
            return String.format("ELFSectionHeaderEntry{nameOffset=%1$d (0x%1$x), name=%2$s, type=%3$d (0x%3$x), flags=%4$d (0x%4$x), addr=%5$d (0x%5$x), offset=%6$d (0x%6$x), size=%7$d (0x%7$x), link=%8$d (0x%8$x)}", Integer.valueOf(this.nameOffset), this.name, Integer.valueOf(this.type), Long.valueOf(this.flags), Long.valueOf(this.addr), Long.valueOf(this.offset), Long.valueOf(this.size), Integer.valueOf(this.link));
        }

        public ELFSectionHeaderEntry(boolean z, ByteBuffer byteBuffer) {
            this.nameOffset = byteBuffer.getInt(0);
            this.type = byteBuffer.getInt(4);
            this.flags = z ? byteBuffer.getLong(8) : byteBuffer.getInt(8);
            this.addr = z ? byteBuffer.getLong(16) : byteBuffer.getInt(12);
            this.offset = z ? byteBuffer.getLong(24) : byteBuffer.getInt(16);
            this.size = z ? byteBuffer.getLong(32) : byteBuffer.getInt(20);
            this.link = byteBuffer.getInt(z ? 40 : 24);
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    public class ELFSectionHeaders {
        public final List<ELFSectionHeaderEntry> entries = C3cG.A0h();

        public List<ELFSectionHeaderEntry> getEntries() {
            return this.entries;
        }

        public ELFSectionHeaders(boolean z, boolean z2, ByteBuffer byteBuffer, RandomAccessFile randomAccessFile) throws IOException {
            long j;
            short s;
            short s2;
            int i;
            byte b;
            if (z) {
                j = byteBuffer.getLong(40);
                s = byteBuffer.getShort(58);
                s2 = byteBuffer.getShort(60);
                i = 62;
            } else {
                j = byteBuffer.getInt(32);
                s = byteBuffer.getShort(46);
                s2 = byteBuffer.getShort(48);
                i = 50;
            }
            int i2 = byteBuffer.getShort(i);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(s);
            randomAccessFile.getChannel().read(byteBufferAllocate, j);
            ELFSectionHeaderEntry eLFSectionHeaderEntry = new ELFSectionHeaderEntry(z, byteBufferAllocate);
            int i3 = (s2 != 0 || j == 0) ? s2 : (int) eLFSectionHeaderEntry.size;
            i2 = i2 == 65535 ? eLFSectionHeaderEntry.link : i2;
            int i4 = i3 * s;
            if (i4 == 0 || i2 == 0) {
                return;
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i4);
            byteBufferAllocate2.order(z2 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.getChannel().read(byteBufferAllocate2, j);
            for (int i5 = 0; i5 < s2; i5++) {
                ByteBuffer byteBufferA0t = BV6.A0t(byteBufferAllocate2, i5 * s);
                byteBufferA0t.order(byteBufferAllocate2.order());
                byteBufferA0t.limit(s);
                this.entries.add(new ELFSectionHeaderEntry(z, byteBufferA0t));
            }
            ELFSectionHeaderEntry eLFSectionHeaderEntry2 = this.entries.get(i2);
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate((int) eLFSectionHeaderEntry2.size);
            byteBufferAllocate3.order(z2 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.getChannel().read(byteBufferAllocate3, eLFSectionHeaderEntry2.offset);
            byteBufferAllocate3.rewind();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(20);
            for (ELFSectionHeaderEntry eLFSectionHeaderEntry3 : this.entries) {
                byteArrayOutputStream.reset();
                byteBufferAllocate3.position(eLFSectionHeaderEntry3.nameOffset);
                while (byteBufferAllocate3.position() < byteBufferAllocate3.limit() && (b = byteBufferAllocate3.get()) != 0) {
                    byteArrayOutputStream.write(b);
                }
                eLFSectionHeaderEntry3.name = byteArrayOutputStream.toString("ASCII");
            }
        }
    }

    public static ELFAnalyser analyse(String str) throws IOException {
        ELFAnalyser eLFAnalyser = new ELFAnalyser(str);
        eLFAnalyser.runDetection();
        return eLFAnalyser;
    }

    private void parseEabiAapcsVfp(ByteBuffer byteBuffer, RandomAccessFile randomAccessFile) throws IOException {
        for (ELFSectionHeaderEntry eLFSectionHeaderEntry : new ELFSectionHeaders(this._64Bit, this.bigEndian, byteBuffer, randomAccessFile).entries) {
            if (".ARM.attributes".equals(eLFSectionHeaderEntry.name)) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) eLFSectionHeaderEntry.size);
                byteBufferAllocate.order(this.bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                randomAccessFile.getChannel().read(byteBufferAllocate, eLFSectionHeaderEntry.offset);
                byteBufferAllocate.rewind();
                Map<ArmAeabiAttributesTag, Object> map = parseArmAttributes(byteBufferAllocate).get(1);
                if (map != null) {
                    Object obj = map.get(ArmAeabiAttributesTag.ABI_VFP_args);
                    if (((obj instanceof Integer) && obj.equals(1)) || ((obj instanceof BigInteger) && AnonymousClass001.A0F(obj) == 1)) {
                        this.armEabiAapcsVfp = true;
                    }
                }
            }
        }
    }

    public static String readNTBS(ByteBuffer byteBuffer, Integer num) {
        if (num != null) {
            byteBuffer.position(num.intValue());
        }
        int iPosition = byteBuffer.position();
        while (byteBuffer.get() != 0 && byteBuffer.position() <= byteBuffer.limit()) {
        }
        byte[] bArr = new byte[(byteBuffer.position() - iPosition) - 1];
        byteBuffer.position(iPosition);
        byteBuffer.get(bArr);
        byteBuffer.position(byteBuffer.position() + 1);
        try {
            return new String(bArr, "ASCII");
        } catch (UnsupportedEncodingException e) {
            throw BV4.A0e(e);
        }
    }

    public static BigInteger readULEB128(ByteBuffer byteBuffer) {
        BigInteger bigIntegerOr = BigInteger.ZERO;
        int i = 0;
        while (true) {
            byte b = byteBuffer.get();
            bigIntegerOr = bigIntegerOr.or(BigInteger.valueOf(b & Byte.MAX_VALUE).shiftLeft(i));
            if ((b & 128) == 0) {
                return bigIntegerOr;
            }
            i += 7;
        }
    }

    private void runDetection() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.filename, "r");
        try {
            if (randomAccessFile.length() > 4) {
                byte[] bArr = new byte[4];
                randomAccessFile.seek(0L);
                randomAccessFile.read(bArr);
                if (Arrays.equals(bArr, ELF_MAGIC)) {
                    this.ELF = true;
                }
            }
            if (this.ELF) {
                byte bA00 = BV4.A00(randomAccessFile, 4L);
                byte b = randomAccessFile.readByte();
                this._64Bit = AnonymousClass002.A1Q(bA00, 2);
                this.bigEndian = AnonymousClass002.A1Q(b, 2);
                randomAccessFile.seek(0L);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this._64Bit ? 64 : 52);
                randomAccessFile.getChannel().read(byteBufferAllocate, 0L);
                byteBufferAllocate.order(this.bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                boolean zA1Q = AnonymousClass002.A1Q(byteBufferAllocate.get(18), 40);
                this.arm = zA1Q;
                if (zA1Q) {
                    int i = byteBufferAllocate.getInt(this._64Bit ? 48 : 36);
                    this.armHardFloatFlag = AnonymousClass002.A1Q(i & 1024, 1024);
                    this.armSoftFloatFlag = (i & 512) == 512;
                    parseEabiAapcsVfp(byteBufferAllocate, randomAccessFile);
                }
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public String getFilename() {
        return this.filename;
    }

    public boolean is64Bit() {
        return this._64Bit;
    }

    public boolean isArm() {
        return this.arm;
    }

    public boolean isArmEabiAapcsVfp() {
        return this.armEabiAapcsVfp;
    }

    public boolean isArmHardFloat() {
        return this.armEabiAapcsVfp || this.armHardFloatFlag;
    }

    public boolean isArmHardFloatFlag() {
        return this.armHardFloatFlag;
    }

    public boolean isArmSoftFloatFlag() {
        return this.armSoftFloatFlag;
    }

    public boolean isBigEndian() {
        return this.bigEndian;
    }

    public boolean isELF() {
        return this.ELF;
    }

    public ELFAnalyser(String str) {
        this.filename = str;
    }

    public static Map<Integer, Map<ArmAeabiAttributesTag, Object>> parseAEABI(ByteBuffer byteBuffer) {
        HashMap mapA0u = BV4.A0u();
        while (byteBuffer.position() < byteBuffer.limit()) {
            int iPosition = byteBuffer.position();
            int iIntValue = readULEB128(byteBuffer).intValue();
            int i = byteBuffer.getInt();
            if (iIntValue == 1) {
                mapA0u.put(Integer.valueOf(iIntValue), parseFileAttribute(byteBuffer));
            }
            byteBuffer.position(iPosition + i);
        }
        return mapA0u;
    }

    public static Map<Integer, Map<ArmAeabiAttributesTag, Object>> parseArmAttributes(ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 65) {
            while (byteBuffer.position() < byteBuffer.limit()) {
                int iPosition = byteBuffer.position();
                int i = byteBuffer.getInt();
                if (i <= 0) {
                    break;
                }
                if ("aeabi".equals(readNTBS(byteBuffer, null))) {
                    return parseAEABI(byteBuffer);
                }
                byteBuffer.position(iPosition + i);
            }
        }
        return Collections.EMPTY_MAP;
    }

    public static Map<ArmAeabiAttributesTag, Object> parseFileAttribute(ByteBuffer byteBuffer) {
        Object objValueOf;
        HashMap mapA0u = BV4.A0u();
        while (byteBuffer.position() < byteBuffer.limit()) {
            ArmAeabiAttributesTag byValue = ArmAeabiAttributesTag.getByValue(readULEB128(byteBuffer).intValue());
            int iOrdinal = byValue.parameterType.ordinal();
            if (iOrdinal == 0) {
                objValueOf = Integer.valueOf(byteBuffer.getInt());
            } else if (iOrdinal == 1) {
                objValueOf = readNTBS(byteBuffer, null);
            } else if (iOrdinal == 2) {
                objValueOf = readULEB128(byteBuffer);
            }
            mapA0u.put(byValue, objValueOf);
        }
        return mapA0u;
    }
}
