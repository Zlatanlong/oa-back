package cn.lcl.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * question_answer
 *
 * @author
 */
@Data
public class QuestionAnswer implements Serializable {
    /**
     * 自增Id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * thing表自增id
     */
    private Integer thingId;

    /**
     * 回执人在user表的Id
     */
    private Integer userId;

    /**
     * thing_question表的id
     */
    private Integer questionId;

    /**
     * 回执人的选择，对应question_option表的id
     */
    private String questionOptionId;

    /**
     * 回执人对该选项/投票项的打分
     */
    private String score;

    /**
     * 回执人对该选项/投票项的评语/备注等
     */
    private String inputText;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 创建者在user表的id
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer creatorId;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    /**
     * 更新者的id
     */
    @TableField(fill = FieldFill.UPDATE)
    private Integer updatorId;

    /**
     * 删除标志（0表示未删除，id表示已删除）
     */
    @TableField(select = false)

    private static final long serialVersionUID = 1L;
}