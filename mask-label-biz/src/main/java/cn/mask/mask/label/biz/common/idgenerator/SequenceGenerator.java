package cn.mask.mask.label.biz.common.idgenerator;


import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 单据号生成器
 * Created by Ray on 2017/2/17.
 */
@Service
public class SequenceGenerator {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    protected final static String CACHEKEY_PREFIX = "mask:label:seq:";

    /**
     * Get next string.
     *
     * @param seqName the seqName
     * @return the string
     */
    public String getNext(String seqName) {
        return getNext(seqName, 8);
    }

    /**
     * Get next string.
     *
     * @param seqName the seqName
     * @param digits  the digits 序列的位数
     * @return the string
     */
    public String getNext(String seqName, int digits) {
        return String.format("%0"+ digits + "d", redisTemplate.opsForValue().increment(CACHEKEY_PREFIX + seqName, 1));
    }

    /**
     * Get next string.
     *
     * @param seqName the seqName 序列的名称
     * @param prefix  the prefix
     * @param digits  the digits 序列的位数
     * @return the string
     */
    public String getNext(String seqName, String prefix, int digits) {
        return prefix + getNext(seqName, digits);
    }
}
