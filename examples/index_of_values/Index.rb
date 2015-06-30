class Index
  def indexSumPair(arr)
    # arr = [4,3,2,1]
    # arr.each {p |a|}
    
  end
  
  def func_one
      proc_new = Proc.new {return "123"}
      proc_new.call
      return "456"
  end

  def func_two
      lambda_new = lambda {return "123"}
      lambda_new.call
      return "456"
  end
  
end

