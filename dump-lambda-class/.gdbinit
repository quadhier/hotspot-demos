break classFileParser.cpp:4351
commands
silent
print $ClassFilePath("class_files", from)
eval "dump binary memory %s cfs->_buffer_start cfs->_buffer_end", $ClassFilePath("class_files", from)
cont
end
